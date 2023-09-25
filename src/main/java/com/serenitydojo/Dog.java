package com.serenitydojo;

public class Dog {
    public String name;
    public String favouriteToy;
    public int age;

    public Dog(String name, String favouriteToy, int age) {
        this.name = name;
        this.favouriteToy = favouriteToy;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setFavouriteToy(String favouriteToy) {
        this.favouriteToy = favouriteToy;
    }

    public String getFavouriteToy() {
        return favouriteToy;
    }

    public int getAge() {
        return age;
    }

    
}
