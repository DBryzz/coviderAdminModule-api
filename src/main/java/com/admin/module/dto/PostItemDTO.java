package com.admin.module.dto;


import com.admin.module.model.Location;

public class PostItemDTO {

    private String itemName;
    private String itemCategory;
    private Location itemLocation;




    public PostItemDTO() {

    }




    public PostItemDTO(String itemName, String itemCategory, Location itemLocation) {
        super();
        this.itemName = itemName;
        this.itemCategory = itemCategory;
        this.itemLocation = itemLocation;
    }




    public String getItemName() {
        return itemName;
    }




    public void setItemName(String itemName) {
        this.itemName = itemName;
    }




    public String getItemCategory() {
        return itemCategory;
    }




    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }




    public Location getItemLocation() {
        return itemLocation;
    }




    public void setItemLocation(Location itemLocation) {
        this.itemLocation = itemLocation;
    }






}
