package com.example.myapplication;


import android.graphics.drawable.Drawable;

public class Party {
    String date;
    String rad;
    String name;
    String address;
    String time;
    Drawable photo;
    public Party(String date, String rad, String name, String address, String time,Drawable photo) {
        this.date = date;
        this.rad = rad;
        this.name = name;
        this.address = address;
        this.time = time;
        this.photo=photo;
    }
}
