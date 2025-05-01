package Java8.RealWorldProblems;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static Java8.RealWorldProblems.EmpList.employeeList;

public class EmpList1 {
    public static void main(String[] args) {
        System.out.println("Number of Employees in Company are "+employeeList.size()+".");
        System.out.println();

        // Q1-> How many Male and Female Employees are in the Organization.
        int males = (int) employeeList.stream().filter(e -> e.getGender().equals("Male")).count();
        System.out.println("The number of males is present in the organization are: "+males);
        System.out.println();
        int females = (int) employeeList.stream().filter(e-> e.getGender().equals("Female")).count();
        System.out.println("The number of females are present in the organization are: "+females);
        System.out.println();

        // Q2-> Print all the Department in the Organization.
        List<String> nameOfDepartment = employeeList.stream().map(e -> e.getDepartment()).distinct().collect(Collectors.toList());
        nameOfDepartment.forEach(System.out::println);
        System.out.println();

        // Q2-> Average Salary of Male and Female employees
        Map<String,Double> avgSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.collectingAndThen(Collectors.averagingDouble(Employee::getSalary), avg-> Math.round(avg*100.0)/100.0)));
        System.out.println(avgSalary);
        avgSalary.forEach((gender, avg) -> System.out.println("Average salary of " + gender + " employees: " + avg));
        System.out.println();

        // Q3-> What is the Average Age of the Male and Female employees
        Map<String,Double> avgAge = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.collectingAndThen(Collectors.averagingInt(e -> e.getAge()),avg-> Math.round(avg * 100.0)/100.0)));
        System.out.println(avgAge);
        avgAge.forEach((gen,age)-> System.out.println("Average Age of "+gen+" is "+age));
        System.out.println();

        // Q4-> Get the details of highest paid employee in the organization?
        Optional<Employee> highestPaidEmp = employeeList.stream().collect(Collectors.maxBy((e1, e2)->Double.compare(e1.getSalary(),e2.getSalary())));
        System.out.println(highestPaidEmp.get());
        Optional<Employee> minPaid = employeeList.stream().max((e1,e2)->Double.compare(e2.getSalary(),e1.getSalary()));
        System.out.println(minPaid.get());
        System.out.println();

        // Q5-> Get the names of all employees who have joined after 2015?
        List<String> empJoinedAfter2015 = employeeList.stream().filter(e->e.yearOfJoining>2015).map(Employee::getName).collect(Collectors.toList());
        System.out.println(empJoinedAfter2015);
        System.out.println();

        // Q6-> Count the number of employees in each department?
        Map<String,Long> noOfEmpByDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        noOfEmpByDept.forEach((str,l)->System.out.println(str+" = "+l));
        System.out.println();

        // Q7-> What is the average salary of each department?
        Map<String,Double> avgSalOfEachDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalOfEachDept);
        System.out.println();

        // Q8-> Find the 2nd Highest Salary from the organization?
        Optional<Employee> secHighSal = employeeList.stream().sorted((e1,e2)->Double.compare(e2.getSalary(),e1.getSalary()))
                .skip(1).findFirst();
        List<Employee> secHighSal1 = employeeList.stream().sorted((e1,e2)->Double.compare(e2.getSalary(),e1.getSalary()))
                .skip(1).limit(1).toList();
        System.out.println(secHighSal.get());
        System.out.println(secHighSal1);
        System.out.println();

        // Q9-> Get the details of youngest male employee in the product development department?
        List<Employee> youngestEmp = employeeList.stream().filter(employee -> employee.getDepartment().equals("Product Development") &&
                employee.getGender().equals("Male")).sorted((e1, e2)->Integer.compare(e1.getAge(), e2.getAge())).limit(1).toList();
        System.out.println("Details of youngest male employee in the product development department");
        youngestEmp.forEach(e->System.out.println("ID: "+e.getId()+"\n"+"Name: "+e.getName()+"\n"+"Age: "+e.getAge()));
        System.out.println();

        // Q10-> Who has the most working experience in the organization?
        List<Employee> mostExp = employeeList.stream().sorted((e1,e2)->Integer.compare(e1.getYearOfJoining(),e2.getYearOfJoining())).limit(1).toList();
        Optional<Employee> mostExp1 = employeeList.stream().sorted((e1,e2)->Integer.compare(e1.getYearOfJoining(),e2.getYearOfJoining())).limit(1).findFirst();
        System.out.println(mostExp);
        System.out.println(mostExp1.get());
        System.out.println();

        // Q11-> How many male and female employees are there in the sales and marketing team?
        Map<String,Long> noOfMalesFemales = employeeList.stream().filter(e->e.getDepartment().equals("Sales And Marketing"))
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println("male and female employees in the sales and marketing team");
        System.out.println(noOfMalesFemales);

        // Q12->  What is the average salary of male and female employees?
        Map<String,Double> avgSal = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.collectingAndThen(Collectors.averagingDouble(Employee::getSalary),avg-> Math.round(avg*100.0)/100.0)));
        System.out.println(avgSal);
        System.out.println();


        Map<String, List<Employee>> employeeListByDepartment=
                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        employeeListByDepartment.forEach((department, employees) -> {
            System.out.println("Department: " + department);
            employees.forEach(e -> System.out.println("ID: " + e.getId() + "\n" + "Name: " + e.getName() + "\n" + "Age: " + e.getAge()));
        });




    }
}
