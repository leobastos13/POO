package aula10.Ex3;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex3 {
    public static void main(String[] args) {
        String string = "Hello World";
        HashMap<Character, ArrayList<Integer>> number = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
            char a = string.charAt(i);

            if (!number.containsKey(a)) {
                number.put(a, new ArrayList<Integer>());
            }
            number.get(a).add(i);
        }
        System.out.println(number);
    }    
}
