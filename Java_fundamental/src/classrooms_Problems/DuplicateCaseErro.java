package classrooms_Problems;

public class DuplicateCaseErro {
    public static void main() {
        int op = 1;
        switch(op){
            case 1:
                System.out.println();
            case 1:
                System.out.println("B");      // cases with same name will give error
        }
    }
}
