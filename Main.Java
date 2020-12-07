package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<cobisstore> inventory = new ArrayList<cobisstore>();
        ArrayList<purchase> order = new ArrayList<purchase>();

        cobisstore cs = new cobisstore();
        cs.setProduct("Red-Hot Spicy Doritos");
        cs.setPrice(2.99);
        inventory.add(cs);
        cs = new cobisstore();
        cs.setProduct("Cool Ranch Doritos");
        cs.setPrice(2.99);
        inventory.add(cs);
        cs = new cobisstore();
        cs.setProduct("Coke");
        cs.setPrice(0.99);
        inventory.add(cs);
        cs = new cobisstore();
        cs.setProduct("Diet Coke");
        cs.setPrice(0.99);
        inventory.add(cs);
        cs = new cobisstore();
        cs.setProduct("Pepsi");
        cs.setPrice(0.99);
        inventory.add(cs);
        cs = new cobisstore();
        cs.setProduct("Five Hour Energy");
        cs.setPrice(3.99);
        inventory.add(cs);
        cs = new cobisstore();
        cs.setProduct("Sunflower Seeds");
        cs.setPrice(0.99);
        inventory.add(cs);
        cs = new cobisstore();
        cs.setProduct("Peanuts");
        cs.setPrice(0.99);
        inventory.add(cs);
        cs = new cobisstore();
        cs.setProduct("Mac Book Chargers");
        cs.setPrice(120.00);
        inventory.add(cs);
        cs = new cobisstore();
        cs.setProduct("Dell Chargers");
        cs.setPrice(50.00);
        inventory.add(cs);

    }
}
