package Contenido1.company;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Carlos Pérez", "Desarrollador", 2500);
        Employee emp2 = new Employee("Laura Gómez", "Gerente", 4000);

        System.out.println("= Información de Empleados =");
        emp1.showInfo();
        emp2.showInfo();

        emp1.increaseSalary(500);
        emp2.increaseSalary(-200);

        System.out.println("= Después del aumento =");
        emp1.showInfo();
        emp2.showInfo();
    }
}

