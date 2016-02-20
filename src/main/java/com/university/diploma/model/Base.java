package com.university.diploma.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dima on 2/20/16.
 */
@Entity
@Table(name="allTable")
public class Base {
    @Id
    private int id;
    @Column
    private String address;
    @Column
    private String number;
    @Column
    private String type;
    @Column
    private String lat;
    @Column
    private String lng;

    public Base() {
    }

    public Base(int id, String address, String number, String type, String lat, String lng) {
        this.id = id;
        this.address = address;
        this.number = number;
        this.type = type;
        this.lat = lat;
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

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "Base{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                ", type='" + type + '\'' +
                ", lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                '}';
    }
}
