package com.university.diploma.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dima on 3/21/16.
 */
@Entity
@Table(name = "pollution_places")
public class PollutionPlace {

    @Id
    private int id;
    @Column
    private String lat;
    @Column
    private String lng;
    @Column
    private  String description;
    @Column(name = "polution_radius")
    private String pollution_radius;

    public PollutionPlace() {

    }

    public PollutionPlace(int id, String lat, String lng, String description, String pollution_radius) {
        this.id = id;
        this.lat = lat;
        this.lng = lng;
        this.description = description;
        this.pollution_radius = pollution_radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPollution_radius() {
        return pollution_radius;
    }

    public void setPollution_radius(String pollution_radius) {
        this.pollution_radius = pollution_radius;
    }

    @Override
    public String toString() {
        return "PollutionPlace{" +
                "id=" + id +
                ", lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                ", description='" + description + '\'' +
                ", pollution_radius='" + pollution_radius + '\'' +
                '}';
    }
}
