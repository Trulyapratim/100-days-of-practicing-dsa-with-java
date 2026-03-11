package classrooms_Problems;

public class NumericLiterals {
    public static void main() {
        IntegerLiterals obj1 = new IntegerLiterals();
        obj1.Test2();
        FloatingPointRepresentation obj2 = new FloatingPointRepresentation();
        obj2.Test();

    }
}
class IntegerLiterals{
    void Test2(){
        int a1 = 2_47_23_095;    // for our convinience to understand output = 24723095;
        System.out.println(a1);
    }
}

class FloatingPointRepresentation{
    void Test() {
        // float f1 = 34.56;  // output = error : incompatible types: possible lossy conversion from double to float
        float f1 = 34.56f;
        System.out.println(f1);
    }
}