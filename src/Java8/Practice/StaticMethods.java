package Java8.Practice;


//import static Java8.Practice.Test.m2;

interface Test {
    static void m2(){
        System.out.println("Static Method in interface");
    }

    public static void main(String[] args) {
        System.out.println("Main method from the interface");
        m2();
    }

}
public class StaticMethods implements Test{
    public static void main(String[] args) {
        //m2(); --> by default static methods are not available to implementing classes.
        Test.m2();
        Test.main(args);
    }

}
/*
* There are only two ways to call the static method of the interface-
*   1--> directly by interface name.method name
*   2--> by using static import "import static Java8.Practice.Test.m2"
* */
