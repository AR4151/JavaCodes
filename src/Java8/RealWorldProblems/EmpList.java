package Java8.RealWorldProblems;

import java.util.ArrayList;
import java.util.List;


public class EmpList {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
        System.out.println("Number of Employees in Company are "+employeeList.size());
        //System.out.println(employeeList);

        // Q1 ->  How many male and female employees are there in the organization?
        int maleCount = 0;
        int femaleCount = 0;
        for (Employee employee : employeeList) {
            /*
            int maleCount = 0;
            int femaleCount = 0;

            +Variable Scope:
            -maleCount and femaleCount are declared inside the loop, so they are local to each iteration.
            -Every time the loop executes, these variables are re-initialized to 0.*/


            if (employee.getGender().equalsIgnoreCase("Male")) {
                maleCount++;
            } else if (employee.getGender().equalsIgnoreCase("Female")) {
                femaleCount++;

            }

        }
        System.out.println("The number of Male Employees are: " + maleCount);
        System.out.println("The number of Female Employees are: " + femaleCount);

        //Using Lambada Expression:
        long maleEmp = employeeList.stream().filter(e->e.getGender().equalsIgnoreCase("Male")).count();
        long femaleEmp = employeeList.stream().filter(e->e.getGender().equalsIgnoreCase("Female")).count();
        System.out.println("The number of Male Employees are: " + maleCount);
        System.out.println("The number of Female Employees are: " + femaleCount);
        System.out.println();

        // Q2 : Print the name of all departments in the organization?
        System.out.println("Different Departments in the Given Company: ");
       List<String> department = employeeList.stream().map(Employee::getDepartment).distinct().toList();
       //System.out.println(department);
       employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
        System.out.println();

       // Q3 : 3 : What is the average age of male and female employees?
        int MaleAvgAge = (int) employeeList.stream().filter(a->a.getGender().equalsIgnoreCase("Male")).mapToInt(Employee::getAge).average().orElse(0);
        //double roundedAverage = Math.round(avgAge * 100.0) / 100.0;
        int FemaleAvgAge = (int) employeeList.stream().filter(a->a.getGender().equalsIgnoreCase("Female")).mapToInt(Employee::getAge).average().orElse(0);

        System.out.println("The Average Age of Employees-");
        System.out.println("Male: "+MaleAvgAge);
        System.out.println("Female: "+FemaleAvgAge);

}
}