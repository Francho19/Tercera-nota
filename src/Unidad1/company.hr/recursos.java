
package company.main;

import company.hr.Employee;

public class Recursos {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Ana García", 75000, "Developer");

        
        emp1.name = "Carlos López";
        emp1.setRole("Manager");
        emp1.setSalary(90000);

        
        System.out.println("Employee 1: " + emp1.name + ", Role: " + emp1.getRole() + ", Salary: " + emp1.getSalary());
        System.out.println("Employee 2: " + emp2.name + ", Role: " + emp2.getRole() + ", Salary: " + emp2.getSalary());

        
        if (emp1.increaseSalary(5000)) {
            System.out.println(emp1.name + "'s salary increased to" + emp1.getSalary());
        }
        if (emp2.increaseSalary(3000)) {
            System.out.println(emp2.name + "'s salary increased  $" + emp2.getSalary());
        }
    }
}