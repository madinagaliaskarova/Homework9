package com.company;

public class Shelter {
    private String name;
    private String adress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Shelter(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }
}


