package classrooms_Problems;


public class DecisionMaking {
    public static void main() {
        boolean cndn = true;
        System.out.print("1");
        if(cndn){
            System.out.print("2");   // cndn = true that why the output is 123
        }
        System.out.print("3");
        System.out.println();
    }
}

class DecisionMaking2{
    public static void main() {
        boolean cndn = false;
        System.out.print("1");
        if(cndn){
            System.out.println("2");
        }
        System.out.print("3");  // output will be 13
    }
}