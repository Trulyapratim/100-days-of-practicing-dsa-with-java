package com.AmanPrakashSharma.Conditionals;

import java.util.Scanner;

public class Loops {
    public static void main() {
        // Q: print numbers from 1 to 5

//         for(initialisation; conditions; increment/decrement){
//             //body
//         }
        /* for(int i = 1; i <= 5; i++){
            System.out.println(i);
        } */

        // Q: Print numbes from 1 to n
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = in.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.print(i + " ");
        }
    }
}
