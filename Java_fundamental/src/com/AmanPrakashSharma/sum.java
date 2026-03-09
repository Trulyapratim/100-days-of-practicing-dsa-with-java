package com.AmanPrakashSharma;

import java.util.Scanner;

public class sum {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2: ");
        int num2  = in.nextInt();

        int res = num1 + num2 ;
        System.out.println("The sum is: " + res);
    }

}
