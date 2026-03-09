package com.AmanPrakashSharma;

import java.util.Scanner;

public class TypeCasting {
    public static void main() {
        Scanner in  = new Scanner(System.in);
//        System.out.print("Enter the value of num: ");
//        float num = in.nextFloat();  //if we input int instead of float it will automatically type cast into float and it is called implicit typeCastig.
//        System.out.println(num);

        int num = (int)(67.63f);
        System.out.println(num);
    }
}
