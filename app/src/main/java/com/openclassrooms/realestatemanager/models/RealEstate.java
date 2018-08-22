package com.openclassrooms.realestatemanager.models;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.Nullable;

import java.sql.Date;

@Entity(foreignKeys =  @ForeignKey(entity = User.class,
        parentColumns = "id",
        childColumns = "userId"))
public class RealEstate {

    @PrimaryKey(autoGenerate = true)
    private long id;

    private String type;
    private String area;
    private String description;
    private String price;
    private int surface;
    private int room;
    private int bathroom;
    private int bedroom;
    @Nullable
    private String PictureUrl;
    @Embedded
    private Address address;
    private boolean status;
    private Date entryDate;
    private Date soldDate;
    private long userId;
    // Miss point of interest maybe a list of String
    //Miss carousel of picture and description maybe a list of Nested object


    public RealEstate() {
    }

    public RealEstate(String type, String area, String description, String price, int surface, int room,
                      int bathroom, int bedroom, @Nullable String pictureUrl, Address address, long userId) {
        this.type = type;
        this.area = area;
        this.description = description;
        this.price = price;
        this.surface = surface;
        this.room = room;
        this.bathroom = bathroom;
        this.bedroom = bedroom;
        PictureUrl = pictureUrl;
        this.address = address;
        this.userId = userId;
    }

    public RealEstate(String type, String area, String price, long userId) {
        this.type = type;
        this.area = area;
        this.price = price;
        this.userId = userId;
    }

    // --- GETTER ---

    public long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getArea() {
        return area;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public int getSurface() {
        return surface;
    }

    public int getRoom() {
        return room;
    }

    public int getBathroom() {
        return bathroom;
    }

    public int getBedroom() {
        return bedroom;
    }

    @Nullable
    public String getPictureUrl() {
        return PictureUrl;
    }

    public Address getAddress() {
        return address;
    }

    public boolean isStatus() {
        return status;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public Date getSoldDate() {
        return soldDate;
    }

    public long getUserId() {
        return userId;
    }


    // --- SETTER ---


    public void setId(long id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    public void setPictureUrl(@Nullable String pictureUrl) {
        PictureUrl = pictureUrl;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public void setSoldDate(Date soldDate) {
        this.soldDate = soldDate;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}