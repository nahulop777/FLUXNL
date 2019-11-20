package com.example.nlopardoflux.Model;

public class Picture {

    private String large;
    private String medium;

    public Picture(String large, String medium) {
        this.large = large;
        this.medium = medium;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }
}
