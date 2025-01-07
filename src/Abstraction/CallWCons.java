package Abstraction;


abstract class Person1{
    String name;
    int age;

    Person1(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class Student1 extends Person1{
    int rollNo;
    int marks;

    @Override
    public String toString() {
        return "Student1{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    Student1(String name, int age, int rollNo, int marks){
        super(name,age);
        this.rollNo=rollNo;
        this.marks=marks;
    }
}

public class CallWCons {
    public static void main(String[] args) {
        Student1 st = new Student1("Roshan",25,4151,81);
        System.out.println(st);
    }
}
