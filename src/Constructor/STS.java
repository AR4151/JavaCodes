package Constructor;


class Animal1{
    //System.out.println("Hi..")
    String ss = "Animal";

    Animal1(){
        //this(10);
        System.out.println("Four Legs");
    }

    Animal1(int a) {
        //this();
        System.out.println("Two Eyes");
    }


        }
class Dog extends Animal1{
    Dog(){
        //super(100);
        System.out.println("Labra");
    }
    Dog(String s){
        System.out.println("Brown Colour");
    }
}
public class STS {
    public static void main(String[] args) {
        Dog dd = new Dog("");
        //Animal1 AA = new Animal1(10);
    }
}
