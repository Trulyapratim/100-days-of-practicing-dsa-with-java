package classrooms_Problems;

public class OverflowUnderflow {
    public static void main(String[] args){
        int a = Integer.MAX_VALUE;    // int 4 byte = 32 bit then the range = -2^(32-1) to 2^(32-1)-1 = 2147483647
        System.out.println(a);
        System.out.println(a + 1);   // it got overflowed

        int b = Integer.MIN_VALUE;
        System.out.println(b);
        System.out.println(b - 1);   // underflow
    }
}
