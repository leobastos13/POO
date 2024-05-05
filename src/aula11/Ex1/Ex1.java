package aula11.Ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        HashMap<String, HashMap<String, Integer>> pares = new HashMap<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("src/aula11/Ex1/historia.txt"));

            scanner.useDelimiter(" |\\.");

            String previousword = "";

            while (scanner.hasNext()) {
                String currentword = scanner.next();

                if (currentword.length() < 3) {
                    continue;
                }

                System.out.println(currentword);

                if (previousword != "") {
                    if (!pares.containsKey(previousword)) {
                        pares.put(previousword, new HashMap<>());
                    }

                    Integer matches = pares.get(previousword).get(currentword);

                    if (matches == null) {
                        matches = 0;
                    }

                    pares.get(previousword).put(currentword, matches + 1);
                }
                previousword = currentword;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não existente!");
        } finally {
            if (scanner != null)
                scanner.close();
        }

        String res = "";
        for (String word : pares.keySet()) {
            res += word + "={";

            for (String otherword : pares.get(word).keySet()) {

                res += String.format("%s=%d ", otherword, pares.get(word).get(otherword));

            }
            res += "}\n";
        }
        System.out.println(res);

    }
}
