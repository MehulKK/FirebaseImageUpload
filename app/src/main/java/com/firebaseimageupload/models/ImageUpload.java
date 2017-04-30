package com.firebaseimageupload.models;

/**
 * Created by Mehul on 30-Apr-17.
 */
public class ImageUpload {
 
    public String name;
    public String url;
 
    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public ImageUpload() {
    }
 
    public ImageUpload(String name, String url) {
        this.name = name;
        this.url= url;
    }
 
    public String getName() {
        return name;
    }
 
    public String getUrl() {
        return url;
    }
}