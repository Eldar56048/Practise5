package com.Interfaces;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class OnlineStore {
    private Scanner sc = new Scanner(System.in);
    private int check = 0;
    private ArrayList<Gemstone> gemstones = new ArrayList<Gemstone>();
    private ArrayList<SemiPreciousStone> semistones = new ArrayList<SemiPreciousStone>();
    private double carats;

    private void fillgemstones() throws FileNotFoundException {

        File file = new File("gemstone.txt");
        Scanner sc = new Scanner(file);
        int id;
        double weight,price;
        String name;
        Gemstone gemstone;
        while (sc.hasNext()) {
            id = sc.nextInt();
            name = sc.next();
            weight = sc.nextDouble();
            price=sc.nextDouble();
            gemstone = new Gemstone(id, name, weight, price);
            gemstones.add(gemstone);
        }
    }

    private void fillsemistone() throws FileNotFoundException {

        File file = new File("semistone.txt");
        Scanner sc = new Scanner(file);
        int id;
        double weight,price;
        String name;
        SemiPreciousStone semiPreciousStone;
        while (sc.hasNext()) {
            id = sc.nextInt();
            name = sc.next();
            weight = sc.nextDouble();
            price=sc.nextDouble();
            semiPreciousStone = new SemiPreciousStone(id, name, weight, price);
            semistones.add(semiPreciousStone);
        }
    }
    public void begin() throws IOException {
        fillgemstones();
        fillsemistone();
        start();
    }
    private void start() throws IOException {
        while (true) {
            System.out.println("Welcome to Store!");
            System.out.println("Select command:");
            System.out.println("1. go to the Store");
            System.out.println("2. Exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                menu();
            } else if (choice == 2) {
                break;
            }
        }

    }

    private void menu() throws IOException {
        while (true) {
            System.out.println("1. Make necklace");
            System.out.println("2. Exit");
            check = sc.nextInt();
            if (check == 1) {
                necklace();
            } else {
                break;
            }
        }
    }

    private void necklace() {
        while (true) {
            System.out.println("Select category of a stone:");
            System.out.println("1. Gem stones");
            System.out.println("2. Semi Precious Stone");
            System.out.println("3. Back to the Menu");
            System.out.print("Enter the number of category:");
            check = sc.nextInt();
            if (check == 1) {
                Gemstone();
            } else if (check == 2) {
                SemiPreciousStone();
            } else {
                break;
            }
        }

    }

    private void Gemstone(){
        while (true) {
            System.out.println("1. Choose the stone");
            System.out.println("2. Back");
            if(check==1){
                while(true) {
                System.out.println("Choose the type");
                for(int i=0;i<gemstones.size();i++){
                    System.out.println(gemstones.get(i).toString());
                }

                    System.out.print("Enter the id of the stone:");
                    check = sc.nextInt();
                    System.out.println("How many carats do you need:");
                    carats = sc.nextDouble();

                    int count = 0;
                    for (int i = 0; i < gemstones.size(); i++) {
                        if (gemstones.get(i).getId() == check) {
                            if(carats>gemstones.get(i).getWeight()){
                                System.out.println("We don’t have so much");
                                break;
                            }
                            System.out.println("From you " + gemstones.get(i).calculate(carats) + "$");
                            gemstones.get(i).setWeight(gemstones.get(i).getWeight()-carats);
                            count++;
                        }
                    }
                    if (count == 0) {
                        System.out.println("Enter id correctly!!!");
                        continue;
                    }
                    System.out.println("1. Rate another stone");
                    System.out.println("2. Back");
                    check=sc.nextInt();
                    if(check==1){
                        continue;
                    }
                    else {
                        break;
                    }
                }



            }
            else{
                break;
            }
        }
    }
    private void SemiPreciousStone(){
        while (true) {
            System.out.println("1. Choose the stone");
            System.out.println("2. Back");
            if(check==1){
                while(true) {
                    System.out.println("Choose the type");
                    for(int i=1;i<=semistones.size();i++){
                        System.out.println(semistones.get(i).toString());
                    }

                    System.out.print("Enter the id of the stone:");
                    check = sc.nextInt();
                    System.out.println("How many carats do you need:");
                    carats = sc.nextDouble();

                    int count = 0;
                    for (int i = 0; i < semistones.size(); i++) {
                        if (semistones.get(i).getId() == check) {
                            if(carats>semistones.get(i).getWeight()){
                                System.out.println("We don’t have so much");
                                break;
                            }
                            System.out.println("From you " + semistones.get(i).calculate(carats) + "$");
                            semistones.get(i).setWeight(semistones.get(i).getWeight()-carats);
                            count++;
                        }
                    }
                    if (count == 0) {
                        System.out.println("Enter id correctly!!!");
                        continue;
                    }
                    System.out.println("1. Rate another stone");
                    System.out.println("2. Back");
                    check=sc.nextInt();
                    if(check==1){
                        continue;
                    }
                    else {
                        break;
                    }
                }



            }

            else{
                break;
            }
        }

    }
}
