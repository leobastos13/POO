package aula10.Ex2;

import java.util.ArrayList;

import aula10.Ex1.Book;
import java.util.TreeMap;


public class Main {
    
    public static void main(String[] args) {
        TreeMap<String, ArrayList<Book>> generos = new TreeMap<>();
        generos.put("Drama", new ArrayList<>());
        generos.get("Drama").add(new Book("The Crash", "Ana Araújo", 2023));
        generos.get("Drama").add(new Book("The Life of a Soldier", "Paula Tavares", 2004));

        generos.put("Terror", new ArrayList<>());
        generos.get("Terror").add(new Book("Horror House", "João Oliveira", 2007));
        generos.get("Terror").add(new Book("The Doll", "Carlos Bastos", 2002));

        generos.put("Romance", new ArrayList<>());
        generos.get("Romance").add(new Book("Her and Me", "Filomena Figueiredo", 2013));
        generos.get("Romance").add(new Book("Summer", "Inês Castro", 2016));

        generos.put("Comédia", new ArrayList<>());
        generos.get("Comédia").add(new Book("Tough Luck", "Leonardo Bastos", 2019));
        generos.get("Comédia").add(new Book("Give me a Break, please", "Pedro Sousa", 2011));

        generos.put("Animação", new ArrayList<>());
        generos.get("Animação").add(new Book("Jack and his little garden", "Gonçalo Soares", 2022));
        generos.get("Animação").add(new Book("Jonny", "Madalena Costa", 2019));

        generos.remove("Animação");

        generos.replace("Drama", null);

        for (String key : generos.keySet()) {
            ArrayList<Book> value = generos.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
