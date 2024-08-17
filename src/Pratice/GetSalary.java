package Pratice;
import java.util.Scanner;

//Class 1-
class Employee{
    int salary;
    String name;
    public int getSalary(){

        return salary;
    }
    public String getName(){

        return name;
    }
    public String setName(String n){

        return name =n;
    }
}
public class GetSalary {
    public static void main(String []args){

        //Problem no1-
        Employee em = new Employee();
        em.salary = 100000;
        em.name = "Roshan";
        System.out.println(em.getName());
        //System.out.println(em.setName("Yash"));
        System.out.println(em.getSalary());
        System.out.println();

        //Problem no2-
        CellPhone cc = new CellPhone();
        cc.ring();
        cc.vib();
        cc.pick();
        System.out.println();

        //Problem no3-
        Square ss = new Square();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the Square:");
        //int side = sc.nextInt();
        ss.side = 5;
        System.out.println("The Area of the Square is "+ss.area());
        System.out.println("The Perimeter of the Square is "+ss.perimeter());

    }
}

//Class 2-
class CellPhone{
    void ring(){
        System.out.println("Ringing...");
    }
    void vib(){
        System.out.println("Vibrating....");
    }
    void pick(){
        System.out.println("Pick Up.....");
    }
}


//Clas 3-
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
