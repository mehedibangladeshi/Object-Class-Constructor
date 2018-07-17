package com.sdmag.iiuc.com;

/**
 * Created by Mehedi on 7/17/2018.
 * mehedipy@gmail.com
 */

public class Main {

    public static void main(String[] args) {

//        Scooby, a dog
        Dog scooby = new Dog();

//        John, a dog
        Dog john = new Dog();

        john.name = "john";
        john.color = "Black";
        System.out.println( "Dog Name: "+ john.name);
        System.out.println( "Dog Color: "+ john.color);
        System.out.println( "__________________________");


//         Tommy, a dog
        Dog tommy = new Dog("Tommy", "Red ad white");
        System.out.println( "Dog Name: "+ tommy.name);
        System.out.println( "Dog Color: "+ tommy.color);




    }
}
