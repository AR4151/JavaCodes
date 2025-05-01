package Java8.RealWorldProblems.a;

import Java8.RealWorldProblems.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(111, "Jiya1 Brein", 37, "Female", "HR", 2011, 55000.0));
        list.add(new Employee(115, "Jiya2 Brein", 32, "male", "Dev", 2010, 45000.0));
        list.add(new Employee(151, "Jiya3 Brein", 34, "Female", "Dev", 2015, 100.0));
        list.add(new Employee(611, "Jiya4 Brein", 30, "Female", "HR", 2021, 25000.0));
        list.add(new Employee(161, "Jiya5 Brein", 33, "male", "HR", 2009, 85000.0));

        List<Employee> list2 = new ArrayList<>();
        list2.add(new Employee(111, "Jiya1 Brein", 37, "Female", "HR", 2011, 55000.0));
        list2.add(new Employee(115, "Jiya2 Brein", 32, "male", "Dev", 2010, 45000.0));
        list2.add(new Employee(151, "Jiya3 Brein", 34, "Female", "test", 2015, 100));
        list2.add(new Employee(611, "Jiya4 Brein", 30, "Female", "HR", 2021, 25000.0));

        List<Employee> femaleEmp = list.stream().filter(emp->emp.getGender().equalsIgnoreCase("female") && emp.getSalary()>30000).collect(Collectors.toList());
        System.out.println(femaleEmp);

        //Map<String,Double> fe

        List<Employee> list3 = new ArrayList<>(list);
        list3.addAll(list2);
        System.out.println(list3);
        System.out.println(list3.size());


        List<Employee> male = list3.stream().filter(e->e.getSalary()==100).toList();
        male.forEach(e-> System.out.println(e.getName()));


        male.forEach(Employee::getName);




    }
}
