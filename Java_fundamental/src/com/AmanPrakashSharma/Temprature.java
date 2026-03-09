package com.AmanPrakashSharma;

import java.util.Scanner;

public class Temprature {
    public static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the temp in C: ");
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println("The temp in F is " + tempF);
    }
}
