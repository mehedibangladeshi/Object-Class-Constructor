package com.sdmag.iiuc.com;

/**
 * Created by Mehedi on 7/17/2018.
 * mehedipy@gmail.com
 */
public class Dog {

    public String name;
    public String color;

    public Dog(){

    }

    public Dog(String name, String color){
        this.name = name;
        this.color = color;
    }


    public void barking(String bark){
        System.out.println("The dog barks like"+bark);
    }

    public void eating(String food){
        System.out.println("The dog says " +food + " is yummy!!");
    }

}
