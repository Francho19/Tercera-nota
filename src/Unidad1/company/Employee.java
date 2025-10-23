package Contenido1.company;

public class Employee {
    public String name;
    private double salary;
    protected String role;

    public Employee(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("El salario debe ser mayor que 0.");
        }
    }

    public void increaseSalary(double amount) {
        if (amount > 0) {
            this.salary += amount;
            System.out.println("Se aumentó el salario en $" + amount);
        } else {
            System.out.println("El aumento debe ser positivo.");
        }
    }

    public void showInfo() {
        System.out.println("Nombre: " + name);
        System.out.println("Rol: " + role);
        System.out.println("Salario: $" + salary);
        System.out.println("---------------------------");
    }
}