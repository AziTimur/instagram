package com.example.instagram.main;

public class PostModel {
    private int img;
    private String comment, data;

    public PostModel(int img, String comment, String data) {
        this.img = img;
        this.comment = comment;
        this.data = data;

    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
