package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sb = new Scanner(System.in);
        System.out.println("Welcome to the Color Converter!!\nWould you like to input an RGB triplet, hexadecimal, or named" +
                " color from 140 HTML colors?\nType '1' for RGB triplet, '2' for hexadecimal, or '3' for named color");
        while (true) {
            int type = sb.nextInt();

            if (type == 1) {
                //RBB triplet
                Hex h = new Hex();
                String res = sb.nextLine();


            } else if (type == 2) {
                //Hexadecimal
                Colors c = new Colors();
                System.out.println("Enter hexadecimal code");
                String answer = sb.nextLine();

            } else if (type == 3) {
                //Color name
                Colors c = new Colors();
                System.out.println("Enter any color name");
                String code = sb.nextLine();

            } else {
                System.out.println("Oops! Try again");
            }
        }

    }
}
