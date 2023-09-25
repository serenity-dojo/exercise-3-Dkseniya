package com.serenitydojo;

import org.junit.Test;

public class WhenCreatingObjects {
    private org.junit.Assert Assert;

    @Test
    public void creating_a_dog() {
        String name = "Fido";
        String favouriteToy = "Bone";
        int age = 5;

        Dog fido = new Dog("Fido", "Bone", 5);


        fido.setFavouriteToy("Bone");
        fido.age = 5;

        System.out.println(fido.getName());
        System.out.println(fido.getFavouriteToy());
        System.out.println(fido.getAge());

        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavouriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);



//    @Test
//       // public void creating_a_dog() {
//       // Dog fido = new Dog("Fido","Bone", 5);
//        Assert.assertEquals(fido.getName(), "Fido");
//        Assert.assertEquals(fido.getFavouriteToy(), "Bone");
//        Assert.assertEquals(fido.getAge(), 5);
//        }








    }
}
