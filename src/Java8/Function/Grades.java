package Java8.Function;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
    String name;
    int marks;
    Student(String name,int marks){
        this.name = name;
        this.marks = marks;
    }
}
public class Grades {
    public static void main(String[] args) {
        Student[] s = {new Student("Roshan", 85),
                new Student("Rohan", 65),
                new Student("Raj", 55),
                new Student("Rakesh", 35)};

        Function<Student, String> f1 = s1 -> {
            String grade;
            if (s1.marks >= 80) grade = "Grade: A (Distinction)";
            else if (s1.marks >= 60) grade = "Grade: B (First Class)";
            else if (s1.marks >= 50) grade = "Grade: C (Second Class)";
            else grade = "Fail";
            return grade;
        };
        for (Student s1 : s) {
            System.out.println("Student Name: "+s1.name);
            System.out.println("Student Marks: "+s1.marks);
            System.out.println(f1.apply(s1));
            System.out.println();
        }

        System.out.println("Excellent in Academics: ");
        Predicate<Student> p = p1 -> p1.marks >= 60;
        /*for (Student s1 : s) {
            if (p.test(s1)) {
                System.out.println("Student Name: "+s1.name);
                System.out.println("Student Marks: "+s1.name);
                System.out.println(f1.apply(s1));
                System.out.println();
            }

        }*/
        Consumer<Student> c= c1->{
            System.out.println("Student Name: "+c1.name);
            System.out.println("Student Marks: "+c1.marks);
            System.out.println(f1.apply(c1));
            System.out.println();
        };
        for (Student s1 : s) {
            if (p.test(s1)) {
                c.accept(s1);
            }
        }
    }
}
