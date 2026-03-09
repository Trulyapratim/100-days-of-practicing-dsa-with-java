package com.AmanPrakashSharma;

import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("please enter some input: ");
        int rollno = in.nextInt();
        System.out.println("Your roll number is " + rollno);
    }
}
