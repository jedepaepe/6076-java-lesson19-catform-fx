package com.example.lesson19fxcatform;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class CatWriter {
    PrintWriter printWriter;

    public CatWriter() throws FileNotFoundException {
        printWriter = new PrintWriter(new FileOutputStream("cats.csv", true));
    }

    public void write(Cat cat) {
        printWriter
                .append(cat.getBreed())
                .append(";")
                .append(String.valueOf(cat.getBirth()))
                .append(";")
                .append(String.valueOf(cat.getWeight()))
                .append(";")
                .append(String.valueOf(cat.getSize()))
                .append(";")
                .append(String.join(" ", cat.getColors()))
                .append("\n");
        printWriter.flush();    // force l'écriture dans le fichier (optionnel)
    }

    public void close() {
        printWriter.close();
    }
}
