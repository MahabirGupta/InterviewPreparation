package LambdaExpressions.consumerFunctionalInterface;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
    String ename;
    int salary;
    String gender;

    public Employee(String ename, int salary,String gender) {
        this.ename = ename;
        this.salary = salary;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee Name: " + ename + ", Salary: " + salary + " , Gender: " + gender;
    }
}
public class Demo1 {

    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(new Employee("Mahabir",3456,"Male"));
        employeeArrayList.add(new Employee("Anish",1565,"Male"));
        employeeArrayList.add(new Employee("Anishkaa",2890,"Female"));
        employeeArrayList.add(new Employee("Babita",5670,"Female"));
        employeeArrayList.add(new Employee("Tom",8960,"Male"));
//        System.out.println(employees);
//        Function
        Function<Employee,Integer> salary = (employee) -> {
            int bonus = (int) (0.10 * employee.salary);

            return bonus;
        };
//        Predicate
        Predicate<Integer> predicate = num -> (num>=500);
//        Consumer
        Consumer<Employee> employeeConsumer = employee -> System.out.println("Employee Name: " + employee.ename + ", Salary: $" + employee.salary + " , Gender: " + employee.gender);

        for (Employee employee:employeeArrayList) {
          int bonus = salary.apply(employee); //Invoke Function
          if (predicate.test(bonus)){ // invoke Predicate
            employeeConsumer.accept(employee);// invoke Consumer
              System.out.println("Bonus = " + bonus);
          }
//            System.out.println("Employee Name: " + employee.ename + " Salary: $" + employee.salary + " and Bonus: $" + salary.apply(employee));

        }
    }
}
