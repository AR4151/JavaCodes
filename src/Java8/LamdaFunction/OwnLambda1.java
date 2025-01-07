package Java8.LamdaFunction;

@FunctionalInterface
interface Cube{
    void cube(int a);
}

public class OwnLambda1 {
    public static void main(String[] args) {
        Cube c = a -> System.out.println(a*a*a);
        c.cube(10);
        c.cube(5);
    }

}
/*
Q1-> So when we use the lambda expression the in the backend it uses the Anonymous classes?

 In the backend, lambda expressions in Java do not use anonymous classes directly. Instead, they are implemented using a different mechanism involving the invokedynamic instruction introduced in Java 7.
How Lambda Expressions Work Behind the Scenes:
Compiler's Role:
The compiler generates a method that matches the lambda expression's body.
It uses the "invokedynamic" instruction to link the lambda expression to this method.
JVM's Role:
At runtime, the JVM creates a synthetic class that implements the functional interface.
The JVM generates an instance of this synthetic class, which represents the lambda expression.

Summary:
Anonymous Class: Explicitly defined and instantiated at compile time.
Lambda Expression: Uses "invokedynamic" to create a synthetic class and instance at runtime.
This approach makes lambda expressions more efficient and lightweight compared to anonymous classes.
 */