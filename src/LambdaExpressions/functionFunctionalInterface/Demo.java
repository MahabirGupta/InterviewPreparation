package LambdaExpressions.functionFunctionalInterface;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
    String ename;
    int salary;

    public Employee(String ename, int salary) {
        this.ename = ename;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee Name: " + ename + ", Salary: " + salary;
    }
}
public class Demo {

    public static void main(String[] args) {
//        Employee employee = new Employee("Mahabir",8000);
//        Function<Employee,Integer> function = name-> employee.salary;
//        System.out.println(function.apply(new Employee("Mahabir",8000)));
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(new Employee("Mahabir",3456));
        employeeArrayList.add(new Employee("Anish",1565));
        employeeArrayList.add(new Employee("Anishkaa",2890));
        employeeArrayList.add(new Employee("Babita",5670));
        employeeArrayList.add(new Employee("Tom",8960));
//        System.out.println(employees);
        Function<Employee,Integer> salary = (employee) -> {
            int bonus = (int) (0.10 * employee.salary);
            return bonus;
        };

        Function<Employee,Integer> employeeIntegerFunction = (employee)->{

            int salary1 = employee.salary;
            if (salary1>=1000 && salary1<=2000){
                return (int) (salary1*0.1);
            }
            else if (salary1>2000 & salary1<=3000){
                return (int) (salary1*0.2);
            }
            else if (salary1>3000 & salary1<=5000){
                return (int) (salary1*0.3);
            }
            else
            return (int) (salary1*0.4);
        };

        Predicate<Integer> predicate = bonus -> bonus>2000;

        for (Employee employee:employeeArrayList) {
//            salary.apply(employee);
            System.out.println("Employee Name: " + employee.ename + " Salary: $" + employee.salary + " and Bonus: $" + salary.apply(employee));

        }
        System.out.println();
        for (Employee employee:employeeArrayList) {
           int bonus = employeeIntegerFunction.apply(employee); //using Function Functional interface
//            System.out.println("Employee Name: " + employee.ename + " Salary: $" + employee.salary + " and Bonus: $" + bonus);
//            System.out.println();
            if (predicate.test(bonus)){ //using Predicate Functional interface
//                System.out.println();
                System.out.println("Employee Name: " + employee.ename + " Salary: $" + employee.salary + " and Bonus: $" + bonus);
            }
        }



    }
}
