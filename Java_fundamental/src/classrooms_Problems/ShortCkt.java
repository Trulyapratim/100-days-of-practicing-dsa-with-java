package classrooms_Problems;

public class ShortCkt {
    public static void main() {
        int x = 0;
        boolean b = false  | ( x++ > 0);
        System.out.println(b);
        b = true || (x++ > 0);
        System.out.println(b);
        b = true && (x++ > 0);
        System.out.println(b);
        b = false && (x++ > 0);
        System.out.println(b);
    }
}
