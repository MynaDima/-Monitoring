package com.university.diploma.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

/**
 * Created by dima on 3/1/16.
 */
@Entity
@Table(name = "usersettings")
public class UserSettings {

    @Id
    private int id;
    @Column
    private boolean  autoservice;
    @Column
    private boolean autoparking;
    @Column
    private boolean library;
    @Column
    private boolean playschool;
    @Column
    private boolean ptu;
    @Column
    private boolean sportschool;
    @Column
    private boolean school;
    @Column
    private boolean artschool;
    @Column
    private boolean restoraun;
    @Column
    private boolean bouling;
    @Column
    private boolean club;
    @Column
    private boolean cafe;
    @Column
    private boolean  musiem;
    @Column
    private boolean cinema;
    @Column
    private boolean thieter;
    @Column
    private boolean   parks;
    @Column
    private boolean   market;
    @Column
    private  boolean  supermarket;
    @Column
    private boolean  childrenshop;
    @Column
    private boolean  shopcenter;
    @Column
    private boolean  swimmingpool;
    @Column
    private boolean  gum;
    @Column
    private boolean  dancingstudio;
    @Column
    private boolean  head;
    @Column
    private boolean beautysaloon;
    @Column
    private boolean well;

    public UserSettings() {
    }

    public UserSettings(int id, boolean autoservice, boolean autoparking, boolean library, boolean playschool, boolean ptu, boolean sportschool, boolean school, boolean artschool, boolean restoraun, boolean bouling, boolean club, boolean cafe, boolean musiem, boolean cinema, boolean thieter, boolean parks, boolean market, boolean supermarket, boolean childrenshop, boolean shopcenter, boolean swimmingpool, boolean gum, boolean dancingstudio, boolean head, boolean beautysaloon, boolean well) {
        this.id = id;
        this.autoservice = autoservice;
        this.autoparking = autoparking;
        this.library = library;
        this.playschool = playschool;
        this.ptu = ptu;
        this.sportschool = sportschool;
        this.school = school;
        this.artschool = artschool;
        this.restoraun = restoraun;
        this.bouling = bouling;
        this.club = club;
        this.cafe = cafe;
        this.musiem = musiem;
        this.cinema = cinema;
        this.thieter = thieter;
        this.parks = parks;
        this.market = market;
        this.supermarket = supermarket;
        this.childrenshop = childrenshop;
        this.shopcenter = shopcenter;
        this.swimmingpool = swimmingpool;
        this.gum = gum;
        this.dancingstudio = dancingstudio;
        this.head = head;
        this.beautysaloon = beautysaloon;
        this.well = well;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public boolean isAutoservice() {
        return autoservice;
    }

    public void setAutoservice(boolean autoservice) {
        this.autoservice = autoservice;
    }

    public boolean isAutoparking() {
        return autoparking;
    }

    public void setAutoparking(boolean autoparking) {
        this.autoparking = autoparking;
    }

    public boolean isLibrary() {
        return library;
    }

    public void setLibrary(boolean library) {
        this.library = library;
    }

    public boolean isPlayschool() {
        return playschool;
    }

    public void setPlayschool(boolean playschool) {
        this.playschool = playschool;
    }

    public boolean isPtu() {
        return ptu;
    }

    public void setPtu(boolean ptu) {
        this.ptu = ptu;
    }

    public boolean isSportschool() {
        return sportschool;
    }

    public void setSportschool(boolean sportschool) {
        this.sportschool = sportschool;
    }

    public boolean isSchool() {
        return school;
    }

    public void setSchool(boolean school) {
        this.school = school;
    }

    public boolean isArtschool() {
        return artschool;
    }

    public void setArtschool(boolean artschool) {
        this.artschool = artschool;
    }

    public boolean isRestoraun() {
        return restoraun;
    }

    public void setRestoraun(boolean restoraun) {
        this.restoraun = restoraun;
    }

    public boolean isBouling() {
        return bouling;
    }

    public void setBouling(boolean bouling) {
        this.bouling = bouling;
    }

    public boolean isClub() {
        return club;
    }

    public void setClub(boolean club) {
        this.club = club;
    }

    public boolean isCafe() {
        return cafe;
    }

    public void setCafe(boolean cafe) {
        this.cafe = cafe;
    }

    public boolean isMusiem() {
        return musiem;
    }

    public void setMusiem(boolean musiem) {
        this.musiem = musiem;
    }

    public boolean isCinema() {
        return cinema;
    }

    public void setCinema(boolean cinema) {
        this.cinema = cinema;
    }

    public boolean isThieter() {
        return thieter;
    }

    public void setThieter(boolean thieter) {
        this.thieter = thieter;
    }

    public boolean isParks() {
        return parks;
    }

    public void setParks(boolean parks) {
        this.parks = parks;
    }

    public boolean isMarket() {
        return market;
    }

    public void setMarket(boolean market) {
        this.market = market;
    }

    public boolean isSupermarket() {
        return supermarket;
    }

    public void setSupermarket(boolean supermarket) {
        this.supermarket = supermarket;
    }

    public boolean isChildrenshop() {
        return childrenshop;
    }

    public void setChildrenshop(boolean childrenshop) {
        this.childrenshop = childrenshop;
    }

    public boolean isShopcenter() {
        return shopcenter;
    }

    public void setShopcenter(boolean shopcenter) {
        this.shopcenter = shopcenter;
    }

    public boolean isSwimmingpool() {
        return swimmingpool;
    }

    public void setSwimmingpool(boolean swimmingpool) {
        this.swimmingpool = swimmingpool;
    }

    public boolean isGum() {
        return gum;
    }

    public void setGum(boolean gum) {
        this.gum = gum;
    }

    public boolean isDancingstudio() {
        return dancingstudio;
    }

    public void setDancingstudio(boolean dancingstudio) {
        this.dancingstudio = dancingstudio;
    }

    public boolean isHead() {
        return head;
    }

    public void setHead(boolean head) {
        this.head = head;
    }

    public boolean isBeautysaloon() {
        return beautysaloon;
    }

    public void setBeautysaloon(boolean beautysaloon) {
        this.beautysaloon = beautysaloon;
    }

    public boolean isWell() {
        return well;
    }

    public void setWell(boolean well) {
        this.well = well;
    }
}
