package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sortowanie2 {
    public static void main(String[] args) {
        List<String> slowa = new ArrayList<>();
        slowa.add("one");
        slowa.add("two");
        slowa.add("three");
        slowa.add("four");
        slowa.add("five");
        slowa.add("six");
        slowa.add("seven");
        slowa.add("eight");
        slowa.add("nine");

        System.out.println(slowa);

        Collections.sort(slowa);

        System.out.println(slowa);
    }
}
