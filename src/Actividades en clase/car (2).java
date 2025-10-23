package Unidad4;

public class car {
    String brand;
    int year;
    public car (String brand, int year){
        this.brand  = brand;
        this.year = year;
    }
    public void showinfo(){
        System.out.println("la mesa es  " + brand + " el año del auto es " + year);
    }
    public static void main(String[] args) {
        car miAuto = new car("Toyota", 2020);
        miAuto.showinfo();
    }
}
