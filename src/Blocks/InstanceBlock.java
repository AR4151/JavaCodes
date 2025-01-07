package Blocks;
/*2. Instance Initializer Block (Non-Static Block):
An instance initializer block runs each time an instance of the class is created, before the constructor is executed.

You can:
Assign values to instance variables.
Call instance methods (but not declare them inside the block).
Use control flow statements (if, for, while, etc.).
Handle exceptions using try-catch blocks.

You cannot:
Declare methods (either instance or static).
Declare static variables (only instance variables).
Declare constructors.

Allowed in instance blocks: Instance variable assignments, instance method calls, control flow, and exception handling.
*/
class InstanceBlock {
    //int y;

    {
        int y = 20;  // You can assign and declare values to Instance variables.
        System.out.println(y);
        System.out.println("Instance Block Executed");

        if (y > 10) {
            System.out.println("y is greater than 10");
        }

        try {
            int result = 100 / y;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }

    public static void main(String[] args) {
        InstanceBlock i = new InstanceBlock();

    }
}

