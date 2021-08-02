package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> houseNumbers = new ArrayList<>();
        houseNumbers.add(10);
        houseNumbers.add(11);
        houseNumbers.add(8);
        houseNumbers.add(1);
        houseNumbers.add(9);
        houseNumbers.add(3);
        houseNumbers.add(6);

        System.out.println(houseNumbers);

        //vrem sa sortam lista
        Collections.sort(houseNumbers);
        System.out.println("dupa sortare");
        System.out.println(houseNumbers);

        List<String> names = new ArrayList<>();
        names.add("Zara");
        names.add("Jane");
        names.add("anne");
        names.add("billy");
        names.add("Bob");
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);

    }
}
