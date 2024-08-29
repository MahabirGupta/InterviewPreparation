package LambdaExpressions.predicateFunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee1 {
    String ename;
    int salary;
    int experience;

    Employee1(String ename, int salary, int experience) {
        this.ename = ename;
        this.salary = salary;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return ename + " " + salary + " " + experience;
    }
}

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<Employee1> employees = new ArrayList<>();
        employees.add(new Employee1("John", 10000, 8));
        employees.add(new Employee1("David", 8500, 4));
        employees.add(new Employee1("Sam", 4300, 1));
        employees.add(new Employee1("Vera", 2700, 7));

        // Define the Predicate once
        Predicate<Employee1> predicate = employee -> (employee.salary > 5000) && (employee.experience > 3);

        // Using for loop
        for (int i = 0; i < employees.size(); i++) {
            if (predicate.test(employees.get(i))) {
                System.out.println(employees.get(i));
            }
        }

        System.out.println();

        // Using enhanced for loop
        for (Employee1 eachEmployee : employees) {
            if (predicate.test(eachEmployee)) {
                System.out.println(eachEmployee.ename + " " + eachEmployee.salary);
            }
        }
    }
}
