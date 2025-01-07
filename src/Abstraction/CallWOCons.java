package Abstraction;

abstract class Person{
    String name;
    int age;

    /*Person(String name,int age){
        this.name=name;
        this.age=age;
    }*/
}
class Student extends Person{
    int rollNo;
    int marks;

    Student(String name,int age,int rollNo,int marks){
        this.name=name;
        this.age=age;
        this.rollNo=rollNo;
        this.marks=marks;
    }
}

public class CallWOCons {

}

