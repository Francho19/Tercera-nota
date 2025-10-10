public class Student {
    String name;
    double grade;
    public Student (String name, double grade){
        this.name = name;
        this.grade = grade;
    }
public class app {
    public static void main(String[] args) {
        Student student1 = new Student("Frank", 29);
    System.out.println("Name: " + student1.name + ", Grade: " + student1.grade);
    Student student2 = new Student("ANA", 4.1);
    System.out.println("Name: " + student2.name + ", Grade: " + student1.grade);
     if (student1.grade > student2.grade) {
            System.out.println(student1.name + " tiene la nota más alta: " + student1.grade);
        } else if (student2.grade > student1.grade) {
            System.out.println(student2.name + " tiene la nota más alta: " + student2.grade);
        } else {
            System.out.println("Ambos tienen la misma nota: " + student1.grade);
        }

    }
    
}

}
