package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sortowanie3 {
    public static void main(String[] args) {

        List<Osoba> osoby = new ArrayList<>();
        osoby.add(new Osoba("Katarzyna", "Niziol"));
        osoby.add(new Osoba("Aneta", "Niziol"));
        osoby.add(new Osoba("Radoslaw", "Wlazly"));
        osoby.add(new Osoba("Malgorzata", "Wrutniak"));
        osoby.add(new Osoba("Ilona", "Blicharz"));
        osoby.add(new Osoba("Teresa", "Pastuszak"));
        osoby.add(new Osoba("Adam", "Niziol"));

        for (Osoba o : osoby) {
            System.out.println(o);
        }

        Collections.sort(osoby, (Osoba o1, Osoba o2) -> o1.getImie().compareTo(o2.getImie()));
        osoby.sort(Comparator.comparing(Osoba::getImie));


        System.out.println(" ++++++++ ");
        for (Osoba o : osoby) {
            System.out.println(o);

        }

        Collections.sort(osoby, (Osoba o1, Osoba o2) -> o1.getNazwisko().compareTo(o2.getNazwisko()));
        osoby.sort(Comparator.comparing(Osoba::getNazwisko));

        System.out.println("--------");
        for (Osoba o2: osoby) {
            System.out.println(o2);
        }
    }
}