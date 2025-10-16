package Contenido2.ActividadGuíada;

public class Main {
    public static void main(String[] args) {
        System.out.println("= Primitivos =");
        int x = 10;
        System.out.println("Antes: x = " + x);
        changePrimitive(x);
        System.out.println("Después de changePrimitive(x): x = " + x);

        System.out.println("\n= Objetos (referencias) =");
        Box box1 = new Box(10);
        Box box2 = box1;
        System.out.print("Antes: box1 = ");
        box1.show();
        System.out.print("Antes: box2 = ");
        box2.show();

        changeBox(box2, 25);
        System.out.print("Después de changeBox(box2,25): box1 = ");
        box1.show();
        System.out.print("Después de changeBox(box2,25): box2 = ");
        box2.show();

        changeReference(box1);
        System.out.print("Después de changeReference(box1): box1 = ");
        box1.show();

        System.out.println("\n=== Punto trampa ===");
        Box box3 = new Box(5);
        System.out.print("Antes: box3 = ");
        box3.show();
        reassignInside(box3);
        System.out.print("Después de reassignInside(box3): box3 = ");
        box3.show();
    }

    public static void changePrimitive(int a) {
        a = 99;
        System.out.println("Dentro de changePrimitive, a = " + a);
    }

    public static void changeBox(Box b, int newSize) {
        b.size = newSize;
        System.out.println("Dentro de changeBox, b.size = " + b.size);
    }

    public static void changeReference(Box b) {
        b = new Box(100);
        System.out.println("Dentro de changeReference se creó un new Box(100) y b ahora apunta a size = " + b.size);
    }

    public static void reassignInside(Box b) {
        b = new Box(99);
        b.size = 99;
        System.out.println("Dentro de reassignInside se reasignó b a new Box(99)");
    }
}
