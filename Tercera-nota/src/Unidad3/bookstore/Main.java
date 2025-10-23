package Unidad3.bookstore;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Cien años de soledad", "Gabriel García Márquez", 45000));
        books.add(new Book("El principito", "Antoine de Saint-Exupéry", 25000));
        books.add(new Book("Don Quijote de la Mancha", "Miguel de Cervantes", 55000));

        BookFileHandler handler = new BookFileHandler();
        handler.saveBooks(books);
        handler.readBooks();
    }
}
