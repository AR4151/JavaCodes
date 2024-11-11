package Java8.LamdaFunction;

import java.util.ArrayList;
import java.util.Collections;

public class Employee {
    String name;
    int id;
    Employee(String name,int id){
        this.name = name;
        this.id = id;
    }
    public String toString(){
        return name +":"+ id;
    }
}
class Test{
    public static void main(String[] args) {
        ArrayList<Employee> l = new ArrayList<Employee>();
        l.add(new Employee("Durga",1212));
        l.add(new Employee("Ravi",133));
        l.add(new Employee("Roshan",1494));
        l.add(new Employee("Raj",2615));
        l.add(new Employee("Teja",616));
        //Collections.sort(l,(e1,e2)->e1.id>e2.id?-1:e1.id<e2.id?+1:0);

        //Collections.sort(l,(e1, e2)-> e2.id.compareTo(e1.id)); --> below comment is for this line.
        Collections.sort(l, (e1, e2) -> Integer.compare(e2.id, e1.id));
        Collections.sort(l,(e1,e2)-> e2.name.compareTo(e1.name));
        System.out.println(l);

    }
}
/* The issue with your sorting code is that you're trying to call the compareTo method on an int type, which doesn't
have that method because int is a primitive data type in Java. The compareTo method is available for wrapper classes like Integer, String, etc.

Here's how to fix it:
Change int to Integer: Since you're working with the id field, which is an int, you need to use the Integer wrapper class. You can do this by replacing the int values with Integer objects.

Use Integer.compare(): Instead of calling compareTo(), use Integer.compare(e2.id, e1.id) for proper comparison.
* */
