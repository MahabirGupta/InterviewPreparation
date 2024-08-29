package LambdaExpressions.demos;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
    String ename;
    int salary;
    int experience;

    public Employee(String ename, int salary, int experience) {
        this.ename = ename;
        this.salary = salary;
        this.experience = experience;
    }
}
public class Demo2 {

    public static void main(String[] args) {
//        pass emp object -> return name if sal>5000 and exp>3
//        Ex1: Single employee object
        Employee employee = new Employee("Mahabir",10000,5);
        Predicate<Employee> employeePredicate = (employee1) -> ((employee.salary>5000)&&(employee.experience>3));
        System.out.println(employeePredicate.test(employee));
        if (employeePredicate.test(employee)){
            System.out.println(employee.ename);
        }

        Employee employee2 = new Employee("Anish",1000,2);
        Predicate<Employee> employeePredicate1 = (employee3) -> ((employee2.salary>5000)&&(employee2.experience>3));
        System.out.println(employeePredicate1.test(employee2));
        if (employeePredicate1.test(employee2)){
            System.out.println(employee2.ename);
        }
        //        Ex2: Multiple employee objects
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John",10000,8));
        employees.add(new Employee("David",8500,4));
        employees.add(new Employee("Sam",4300,1));
        employees.add(new Employee("Vera",2700,7));
//        for (int i = 0; i < employees.size(); i++) {
////            Predicate<Employee> arrayListPredicate = (employeePredicates) ->((employee.salary>5000)&&(employee.experience>3));
////            arrayListPredicate.test(employees.get(i));
//            if (employeePredicate.test(employees.get(i))){
//                System.out.println(employees.get(i));
//            }
//        }
        System.out.println();
        for (Employee eachEmployee: employees) {
            Predicate<Employee> arrayListPredicate = (employeePredicate4) -> ((eachEmployee.salary>5000) &&(eachEmployee.experience>3));
            if (arrayListPredicate.test(eachEmployee)){
                System.out.println(eachEmployee.ename + " " + eachEmployee.salary);
            }
        }


    }
}
