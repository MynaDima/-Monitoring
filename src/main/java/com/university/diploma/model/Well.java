package com.university.diploma.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dima on 1/6/16.
 */
@Entity
@Table(name="well")
public class Well {

    @Id
    private int id;
    @Column
    private String address;
    @Column
    private double lat;
    @Column
    private double lng;

    public Well() {
    }

    public Well(int id, String address, double lat, double lng) {
        this.id = id;
        this.address = address;
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
