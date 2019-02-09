package com.cybertek;

import com.github.javafaker.Faker;

public class anything {
    public static void main(String[] args) {
        System.out.println("miradel mijit");

        Faker faker = new Faker();


        System.out.println(faker.address().zipCode());
        System.out.println(faker.app().name());

        System.out.println(faker.funnyName().name());


    }
}
