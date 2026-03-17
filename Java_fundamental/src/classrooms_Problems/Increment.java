package classrooms_Problems;

public class Increment {
    public static void main() {
        int n = 5, x = 0;
        x = n++;
        System.out.printf("n = %d\n", x);  // n ko x me pehle use kar liya and then usko increment kar diya that is now x contains 6
        x = ++n;                            // now n ko  pehle increment kar ke then usko x me store karna h . x == 7
        System.out.printf("n = %d\n", x);
    }
}
