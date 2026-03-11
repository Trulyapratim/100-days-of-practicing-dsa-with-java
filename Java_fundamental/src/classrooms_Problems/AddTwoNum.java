package classrooms_Problems;

import java.util.Scanner;

class Add {             // here we have created a class name Add
    void add() {        // now we have created a method
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n1: ");
        int n1 = in.nextInt();
        System.out.println("Enter n2: ");
        int n2 = in.nextInt();
        int sum = n1 + n2;
        System.out.println("The sum of n1 and n2 is: " + sum);
    }
}

public class AddTwoNum {
    public static void main() {
        Add t = new Add();    // we have created a new object of Add with class Add
        t.add();
    }
}