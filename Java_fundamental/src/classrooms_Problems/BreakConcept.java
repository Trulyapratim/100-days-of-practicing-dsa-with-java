package classrooms_Problems;

import java.sql.SQLOutput;

public class BreakConcept {
    public static void main() {
        int op = 1;
        switch(op){
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
                break;                           // output will be 1 \n 2 and after that it will break out
            case 3:
                System.out.println("3");

            default:
                System.out.println("4");
        }
    }
}
