package com.erhanikinci.oopprogramming;

import static com.erhanikinci.oopprogramming.HouseDecor.roomName;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User myUser = new User("Erhan", "Software Developer");
        System.out.println(myUser.name);

        User newUser = new User("Erkan", "Electronic Engineer");
        System.out.println(newUser.name);

        System.out.println(myUser.information());


        //Encapsulation
        Musician james = new Musician("James", "Guitar", 50);
        System.out.println(james.getName());
        james.setAge(32, "Erhan");
        System.out.println(james.getAge());


        //Inheritance
        SuperMusician lars = new SuperMusician("Lars", "Drums", 55);
        System.out.println(lars.sing());
        System.out.println(lars.getAge());

        //Polymorphism
        //Static Polymorphism  --> Aynı sınıfım içerisinde farklı metodları aynı isim ile kullanmaya static polymorphism denir.
        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(2,3));
        System.out.println(mathematics.sum(2,3 , 4));

        //Dynamic Polymorphism
        Animal myAnimal = new Animal();
        myAnimal.sing();

        Dog barley = new Dog();
        barley.test();
        barley.sing();

        Piano piano = new Piano();
        piano.brand = "Yamaha";
        piano.digital = true;
        piano.info();


    }
}