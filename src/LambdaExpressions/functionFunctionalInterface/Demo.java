package LambdaExpressions.functionFunctionalInterface;

import java.util.function.Function;

class Employee{
    String ename;
    int salary;

    public Employee(String ename, int salary) {
        this.ename = ename;
        this.salary = salary;
    }
}
public class Demo {

    public static void main(String[] args) {
        Employee employee = new Employee("Mahabir",8000);
        Function<Employee,Integer> function = name-> employee.salary;
        System.out.println(function.apply(new Employee("Mahabir",8000)));

    }
}
