package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        ArrayList<cobisstore> inventory = new ArrayList<cobisstore>();
        ArrayList<customer> order = new ArrayList<customer>();

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

        Scanner input = new Scanner(System.in);
        String response = "";
        String product = " ";
        customer co = new customer();
        int index = -1;

        do {
            System.out.println("Welcome to Cobis Convenience! What would you like to do?" + " " +
                    "Type 'a' for add customer. Type 'c' for close store. ");
            response = input.nextLine();
            if (response.equals("a")) {
                System.out.print("Name:");
                String customername = input.nextLine();
                co.setName(customername);

                do {
                    System.out.println("Thank you. Which products would you like to purchase? If you are finished shopping please type 'finished'.");
                     product = input.nextLine();
                    for (int i = 0; i < inventory.size(); i++) {
                        if (inventory.get(i).getProduct().equals(product)) {
                            index = i;

                            String cppd = inventory.get(index).getProduct();
                            Double cppr = inventory.get(index).getPrice();
                            co = new customer();
                            co.setProdpurch(cppd);
                            co.setProdprice(cppr);
                            order.add(co);
                        }
                    }

                } while (!product.equals("finished"));


            }
        } while (!response.equals("c")) ;
            double totalcost = 0.0;
            for (int i = 0; i < order.size(); i++) {
                double item = order.get(i).getProdprice();
                totalcost += item;
            }
        System.out.println("Closing Receipts:");
        System.out.println("Grand Total" + " :" +totalcost);


    }

}





