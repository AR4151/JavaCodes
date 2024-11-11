package Polymophism.Overriding;

// Parent class
class Parent {
    void display() {
        System.out.println("This is the display method of the Parent class.");
    }
}

// Child class
class Child extends Parent {

    void display() {
        System.out.println("This is the display method of the Child class.");
    }

    void callParentDisplay() {
        // Call the display method of the Parent class using super
        super.display();
        this.display();
    }
    {
        super.display();
    }
}

// Main class
public class Super {
    public static void main(String[] args) {
        Child child = new Child();

        // Call Child's display method
        child.display(); // Output: This is the display method of the Child class.

        // Call Parent's display method using super
        child.callParentDisplay(); // Output: This is the display method of the Parent class.
    }
}

