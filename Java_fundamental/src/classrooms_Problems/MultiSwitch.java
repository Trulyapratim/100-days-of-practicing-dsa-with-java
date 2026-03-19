package classrooms_Problems;

public class MultiSwitch {
    public static void main() {
        int op = 2;
        switch(op){
            case 1: case 3: case 5: case 7: case 9:
                System.out.println("odd"); break;
            case 2: case 4: case 6: case 8: case 0:
                System.out.println("even"); break;
            default:
                System.out.println("default");
        }
    }
}
