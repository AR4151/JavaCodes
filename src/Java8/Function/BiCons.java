package Java8.Function;


import java.util.ArrayList;
import java.util.function.BiConsumer;

class Employee{
    String name;
    double salary;
    Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }
    /*@Override
    public String toString(){
        return "Employee Name: "+name+"\r\n"+"Employee Salary: "+salary;
    }*/
}
public class BiCons {
    public static void main(String[] args) {
        ArrayList<Employee> l = new ArrayList<Employee>();
        l.add(new Employee("Roshan",80000));
        l.add(new Employee("Rohan",60000));
        l.add(new Employee("Raj",50000));
        l.add(new Employee("Shreya",70000));
        //System.out.println(l);

        BiConsumer<Employee,Double> b = (e,d)-> e.salary = e.salary+d;
        for(Employee e : l){
            b.accept(e, 5000.0);
        }
        for(Employee e1 : l){
            System.out.println("Employee Name: "+e1.name);
            System.out.println("Employee Salary: "+e1.salary);
            System.out.println();
        }

    }

}
