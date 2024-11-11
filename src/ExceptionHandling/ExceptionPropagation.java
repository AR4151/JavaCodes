package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionPropagation {
    void m1(String name) throws FileNotFoundException /*SQLException*/ {
        if(name.length() < 5){
            throw new RuntimeException("Please enter name with at least 5 characters");
        }
        System.out.println("Welcome "+name);
        new ExceptionPropagation().m2();
    }
    void m2() throws FileNotFoundException {
        FileInputStream stream = new FileInputStream("file");
        new ExceptionPropagation().m3();
    }
    void m3()  {
        int a = 100 / 0;

    }

    public static void main(String[] args) throws FileNotFoundException {
        ExceptionPropagation test = new ExceptionPropagation();
        //test.m1("Test123");
        try {
            test.m1("Test123");
        } catch (IOException  /*SQLException*/ | NullPointerException e) {
            System.out.println("Got exception in main method");
        }

        System.out.println("Main method message");
    }
}
