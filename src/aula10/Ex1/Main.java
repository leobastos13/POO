package aula10.Ex1;

import java.util.HashMap;

public class Main {
    
    public static void main(String[] args) {
        HashMap<String, Book> generos = new HashMap<>();
        generos.put("Drama", new Book("The Crash", "Ana Araújo", 2023));
        generos.put("Terror", new Book("Horror House", "João Oliveira", 2007));
        generos.put("Romance", new Book("Her and Me", "Filomena Figueiredo", 2013));
        generos.put("Comédia", new Book("Tough luck", "Leonardo Bastos", 2019));
        generos.put("Animação", new Book("Jack and his little garden", "Gonçalo Soares", 2022));

        generos.remove("Animação");

        generos.replace("Drama", new Book(null, null, 0));

        for (String key : generos.keySet()) {
            Book value = generos.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
