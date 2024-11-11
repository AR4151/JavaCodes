package Blocks;

/*1. Static Block (Static Initializer Block):
A static block is used to initialize static variables or to perform some one-time setup for the class when it is first loaded.

You Can:
Assign values to static variables.
Call static methods (but not declare them inside the block).
Use control flow statements like if, for, while, etc.

You Cannot:
Declare methods (either static or instance methods).
Declare instance variables (static blocks are only for static data).
Declare constructors.

Allowed in static blocks: Static variable assignments, static method calls, control flow, and exception handling.
*/

class Test {
    static int x;
    int y;

    static {
        //static int x = 15;
        int t=15;
        System.out.println(t);
        int u=15;
        Test s = new Test();
        s.y=15;
        x = 10; // You can initialize static variables.
        System.out.println(u);
        System.out.println("Static Block Executed");

        if (x > 5) {
            System.out.println("x is greater than 5");
        }

        try {
            int result = 100 / x;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
    /*{
        //static int x = 15;
        int t=15;
        System.out.println(t);
        int u=15;
        Test s = new Test();
        s.y=15;
        x = 10; // You can initialize static variables.
        System.out.println(u);
        System.out.println("Static Block Executed");

        if (x > 5) {
            System.out.println("x is greater than 5");
        }

        try {
            int result = 100 / x;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }*/
    {
        System.out.println("Inst Block");
    }

    public static void main(String[] args) {
        //Test tt = new Test();

    }
}

