package com.openclassrooms.realestatemanager.views;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.openclassrooms.realestatemanager.R;
import com.openclassrooms.realestatemanager.models.RealEstate;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RealEstateViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.item_picture)
    ImageView mImageViewPicture;
    @BindView(R.id.item_name)
    TextView mTextViewName;
    @BindView(R.id.item_location)
    TextView mTextViewLocation;
    @BindView(R.id.item_price)
    TextView mTextViewPrice;

    public RealEstateViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void updateWithRealEstate(RealEstate realEstate, RequestManager glide) {

        if (realEstate != null) {
            this.mTextViewName.setText(realEstate.getType());
            this.mTextViewLocation.setText(realEstate.getArea());
            this.mTextViewPrice.setText(realEstate.getPrice());
            if (realEstate.getPictureUrl() != null) {
                glide.load(realEstate.getPictureUrl())
                        .apply(RequestOptions.circleCropTransform())
                        .into(this.mImageViewPicture);
            }
        }

    }
}
