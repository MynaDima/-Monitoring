package com.university.diploma.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dima on 1/6/16.
 */
@Entity
@Table(name="shop")
public class Shop {

    @Id
    private int id;
    @Column
    private String address;
    @Column
    private String number;
    @Column
    private String type;
    @Column
    private double lat;
    @Column
    private double lng;

    public Shop() {
    }

    public Shop(int id, String address, String number, String type, double lat, double lng) {
        this.id = id;
        this.address = address;
        this.number = number;
        this.type = type;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
