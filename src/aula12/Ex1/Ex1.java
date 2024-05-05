package aula12.Ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex1 {

    public static void main(String[] args) {
        
        String path = "src/aula12/Ex1/historia.txt";
        
        Set<String> differentWords = new HashSet<>();

        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String word = scanner.next();

                word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

                differentWords.add(word);
            }

            scanner.close();
        } catch (FileNotFoundException notFound) {
            notFound.printStackTrace();
        }

        System.out.println("Número de palavras diferentes: " + differentWords.size());
    }
}