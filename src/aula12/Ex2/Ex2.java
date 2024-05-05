package aula12.Ex2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex2 {
    public static void main(String[] args) {
        // Caminho para o arquivo de texto
        String path = "src/aula12/Ex2/A_cidade_e_as_serras.txt";

        // Criação do mapa para agrupar as palavras
        Map<Character, Map<String, Integer>> groupedWords = new TreeMap<>();

        // Leitura do arquivo
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);

            // Percorre cada palavra no arquivo
            while (scanner.hasNext()) {
                String word = scanner.next();

                // Remove caracteres especiais e converte para letras minúsculas
                word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

                // Verifica se a palavra possui três caracteres ou mais
                if (word.length() >= 3) {
                    char firstChar = word.charAt(0);

                    // Obtém o mapa de palavras iniciadas pela mesma letra
                    Map<String, Integer> wordsWithSameFirstChar = groupedWords.getOrDefault(firstChar, new HashMap<>());

                    // Incrementa o número de ocorrências da palavra
                    wordsWithSameFirstChar.put(word, wordsWithSameFirstChar.getOrDefault(word, 0) + 1);

                    // Atualiza o mapa de palavras agrupadas
                    groupedWords.put(firstChar, wordsWithSameFirstChar);
                }
            }

            scanner.close();
        } catch (IOException notFound) {
            notFound.printStackTrace();
        }

        // Escreve a estrutura de palavras agrupadas em um arquivo ordenado
        Estrutura(groupedWords);
    }

    public static void Estrutura(Map<Character, Map<String, Integer>> groupedWords) {
        String path = "src/aula12/Ex2/historia.txt";

        try {
            FileWriter file = new FileWriter(path);

            // Percorre as iniciais em ordem alfabética
            for (Character first : groupedWords.keySet()) {
                file.write(first + ":\n");

                // Obtém o mapa de palavras iniciadas pela mesma letra
                Map<String, Integer> wordsWithSameFirstChar = groupedWords.get(first);

                // Percorre as palavras em ordem alfabética
                for (String word : new TreeMap<>(wordsWithSameFirstChar).keySet()) {
                    int matches = wordsWithSameFirstChar.get(word);
                    file.write(word + ": " + matches + "\n");
                }

                file.write("\n");
            }

            file.close();

            String res = "";
            for (Character word : groupedWords.keySet()) {
                res += word + "={";

                for (String otherword : groupedWords.get(word).keySet()) {

                    res += String.format("%s=%d ", otherword, groupedWords.get(word).get(otherword));

                }
                res += "}\n";
            }
            System.out.println(res);
        } catch (IOException notFound) {
            notFound.printStackTrace();
        }
    }
}
