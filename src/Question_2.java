import java.util.*;

class Employee implements Comparable<Employee>{
    Double age;
    Double salary;
    String name;

    Employee(Double age, Double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }
    public String toString() {
        return  name + " " + age + " | Salary : " +salary + "\n";
    }
    public int compareTo(Employee employee) {
        return this.name.compareTo(employee.name);
    }

}


class MyComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
        return (int) (e1.salary - e2.salary);
    }
}


public class Question_2 {
    public static void main(String[] args) {


        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(22.0, 15000.0, "Akshat Srivastava"));
        employees.add(new Employee(23.0, 35000.0, "Abhinav Sharma"));
        employees.add(new Employee(21.0, 15000.0, "Kunal Rawat"));
        employees.add(new Employee(21.0, 83000.0, "Jay Gupta"));


        Collections.sort(employees,new MyComparator());
        System.out.println(employees.toString());

    }
}


