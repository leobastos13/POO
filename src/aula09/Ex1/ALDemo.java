package aula09.Ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.TreeSet;
import aula06.Pessoa;
import aula07.Date;
import aula07.DateYMD;

public class ALDemo {
    
    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();
        for (int i = 10; i <= 100; i+=10) 
            c1.add(i);
        System.out.println("Size: " + c1.size());
        for (int i = 0; i < c1.size(); i++) 
            System.out.println("Elemento: " + c1.get(i));

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio"); 
        c2.remove(0);
        System.out.println(c2);

        Set<Pessoa> c3 = new HashSet<>();
        c3.add(new Pessoa("Pedro", 1234567, new aula05.DateYMD(10, 11, 2005) ));
        c3.add(new Pessoa("Joao", 2345678, new aula05.DateYMD(6, 7, 2001)));
        c3.add(new Pessoa("Carlos", 3456789, new aula05.DateYMD(7, 8, 2002)));
        c3.add(new Pessoa("Goncalo", 4567890, new aula05.DateYMD(8, 9, 2003)));
        c3.add(new Pessoa("Maria", 5678901, new aula05.DateYMD(9, 10, 2004)));
        System.out.println(c3);
        Iterator<Pessoa> it = c3.iterator();
        System.out.println("Iterator values: ");
        while (it.hasNext()) {
            System.out.print(it.next());
        }

        Set<Date> c4 = new TreeSet<>();
        c4.add(new DateYMD(1, 2, 2012));
        c4.add(new DateYMD(2, 3, 2013));
        c4.add(new DateYMD(3, 4, 2014));
        c4.add(new DateYMD(4, 5, 2015));
        c4.add(new DateYMD(5, 6, 2016));
        System.out.println(c4);

    }
}
