package company.hr;

public class Employee {
    public String name;         
    private double salary;      
    protected String role;      

    
    public Employee() {}

    
    public Employee(String name, double salary, String role) {
        this.name = name;
        setSalary(salary);
        this.role = role;

    public double getSalary() {
        return salary;
    }

    
    public void setSalary(double salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary must be greater than 0.");
        }
        this.salary = salary;
    }

    
    public void setRole(String role) {
        this.role = role;
    }
    
    public String getRole() {
        return role;
    }

    
    public boolean increaseSalary(double amount) {
        if (amount <= 0) {
            System.out.println("Increase amount must be positive.");
            return false;
        }
        this.salary += amount;
        return true;
    }

    
    public String getPublicInfo() {
        return name + " - " + role;
    }
}