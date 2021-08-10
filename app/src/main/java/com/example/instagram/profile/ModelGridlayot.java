package com.example.instagram.profile;

import android.widget.ImageView;

public class ModelGridlayot {
    private int image,image2,image3,image4;

    public ModelGridlayot(int image, int image2, int image3, int image4) {
        this.image = image;
        this.image2 = image2;
        this.image3 = image3;
        this.image4 = image4;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }

    public int getImage3() {
        return image3;
    }

    public void setImage3(int image3) {
        this.image3 = image3;
    }

    public int getImage4() {
        return image4;
    }

    public void setImage4(int image4) {
        this.image4 = image4;
    }
}
