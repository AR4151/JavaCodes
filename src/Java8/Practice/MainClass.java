package Java8.Practice;

interface InterfaceA {
    default void show() {
        System.out.println("Default method in InterfaceA");
    }
}

interface InterfaceB {
    default void show() {
        System.out.println("Default method in InterfaceB");
    }
}

class MyClass implements InterfaceA, InterfaceB {
    // Resolve conflict by overriding the show() method
    @Override
    public void show() {
        // Call the default method of InterfaceA
        InterfaceA.super.show();

        // Call the default method of InterfaceB
        InterfaceB.super.show();

        System.out.println("Custom implementation in MyClass");
    }
}

public class MainClass {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show();
    }
}
