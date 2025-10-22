package Unidad3.bookstore;

import java.io.*;
import java.util.*;

public class BookFileHandler {

    private static final String FILE_NAME = "books.txt";

    public void saveBooks(List<Book> books) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Book b : books) {
                writer.write(b.getTitle() + "," + b.getAuthor() + "," + b.getPrice());
                writer.newLine();
            }
            System.out.println("📚 Libros guardados correctamente en el archivo.");
        } catch (IOException e) {
            System.out.println("❌ Error al guardar los libros: " + e.getMessage());
        } finally {
            System.out.println("Operación finalizada (guardar libros).");
        }
    }

    public void readBooks() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\n📖 Lista de libros en el archivo:");
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    Book book = new Book(data[0], data[1], Double.parseDouble(data[2]));
                    System.out.println(book);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("⚠️ Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("❌ Error al leer el archivo: " + e.getMessage());
        } finally {
            System.out.println("Operación finalizada (leer libros).");
        }
    }
}
