package com.mycompany;

import manifold.ext.rt.api.Jailbreak;
import manifold.science.measures.Mass;

import static manifold.science.util.UnitConstants.kg;

public class MainApp {

    public static void main(String[] args) throws Exception {

       // science
        Mass mass = 5 kg * 2.2;
        System.out.println( mass.getValue().intValue());

        // property
        Person john = new Person();
        john.title = "Mr";
        john.name = "John";
        System.out.println( john.title + " " + john.name);

        // jailbreak
        @Jailbreak Account account = new Account();
        account.accountName = "Deposit";
        account.compute();

        // darkj
        Pet pet = Pet.create();
        System.out.println( pet.say() );
    }
}
