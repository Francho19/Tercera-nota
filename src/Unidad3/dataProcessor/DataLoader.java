package Unidad3.dataProcessor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataLoader {

    public void loadFile(String filename) throws IOException, EmptyFileException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();

        if (line == null) {
            reader.close();
            throw new EmptyFileException("El archivo está vacío.");
        }

        System.out.println("Contenido del archivo:");
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }

        reader.close();
    }
}