package Collections.Sets.TreeSet;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.TreeSet;

public class Employee implements Comparable{
    String name;
    int eid;
    Employee(String name,int eid){
        this.name = name;
        this.eid = eid;
    }
    public String toString(){
        return name + "-" +eid;
    }

    @Override
    public int compareTo(@NotNull Object obj) {
        int eid1 = this.eid;
        Employee e = (Employee) obj;
        int eid2 = e.eid;
        if(eid1 < eid2){
            return -1;
        } else if (eid1 > eid2) {
           return +1;
        }
        else return 0;
    }
}
 class Comp{
     public static void main(String[] args) {
         Employee e1 = new Employee("Shah Rukh Khan",1);
         Employee e2 = new Employee("Amir Khan",2);
         Employee e3 = new Employee("Yash",3);
         Employee e4 = new Employee("Prabhas",4);
         Employee e5 = new Employee("Prabhas",4);
         TreeSet t = new TreeSet();
         t.add(e1);
         t.add(e2);
         t.add(e3);
         t.add(e4);
         t.add(e5);
         System.out.println(t);

         TreeSet t1 = new TreeSet(new MyComp());
         t1.add(e1);
         t1.add(e2);
         t1.add(e3);
         t1.add(e4);
         t1.add(e5);
         System.out.println();
         System.out.println(t1);
     }
 }
 class MyComp implements Comparator{

     @Override
     public int compare(Object o1, Object o2) {
         Employee e1 = (Employee) o1;
         Employee e2 = (Employee) o2;
         String s1 = e1.name;
         String s2 = e2.name;
         return s1.compareTo(s2);
     }
 }