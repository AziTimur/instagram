package com.example.instagram.likes;

public class LikeModel {
    private int avatar, photo;
    private  String userName,time;

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public LikeModel(int avatar, int photo, String userName, String time) {
        this.avatar = avatar;
        this.photo = photo;
        this.userName = userName;
        this.time = time;

    }
}
