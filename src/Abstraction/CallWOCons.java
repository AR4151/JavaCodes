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

    /*public Student() {

    }*/

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class CallWOCons {
    public static void main(String[] args) {


        Student ss = new Student("Raj", 19, 40, 60);
        //Student ss1 = new Student();
        System.out.println(ss);


    }
}

