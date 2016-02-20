package com.university.diploma.model;

/**
 * Created by dima on 2/20/16.
 */
public class Coordinates {

    private float lat;
    private float lng;

    public Coordinates() {
    }

    public Coordinates(float lat, float lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLng() {
        return lng;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
