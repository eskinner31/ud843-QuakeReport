package com.example.android.quakereport;

/**
 * Created by Skinner on 12/17/16.
 */

public class Earthquake {
    private String mPlace;
    private String mMagnitude;
    private String mDate;

    public Earthquake(String place, String magnitude, String date) {
        mPlace = place;
        mMagnitude = magnitude;
        mDate = date;
    }

    public Earthquake(String place, String date) {
        mPlace = place;
        mDate = date;
    }

    public String getPlace() {
        return mPlace;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getDate() {
        return mDate;
    }

}
