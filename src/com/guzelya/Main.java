package com.guzelya;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> namesA = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a name: ");
            String name = scanner.next();
            namesA.add(name);
        }
        System.out.println("NamesA: " + namesA);

        ArrayList<String> namesB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a name: ");
            String name = scanner.next();
            namesB.add(name);
        }
        System.out.println("NamesB: " + namesB);
        Collections.reverse(namesB);

        ArrayList<String> namesC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            namesC.add(namesA.get(i));
            namesC.add(namesB.get(i));
        }
        System.out.println("NamesC: " + namesC);

        namesC.sort(Comparator.comparing(String::length));
        System.out.println(namesC);
    }
}
