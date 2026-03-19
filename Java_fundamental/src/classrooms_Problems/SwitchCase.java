package classrooms_Problems;

import java.sql.SQLOutput;

public class SwitchCase {
    public static void main() {
        int op = 1;
        switch(op){
            case 1:
                System.out.println("1");
                case 2:
                    System.out.println("2");   // fall through concept took place here
            default :
                System.out.println("3");


        }
    }
}
