package week4;

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Gelu");
        names.add("Alunelu");
        names.add("Purcelu");
        names.add("Gelu");
        names.add("Gelu");

        Set<String> namesSet = new TreeSet<>();
        for(String studenti : names){
            namesSet.add(studenti);
        }
        System.out.println(namesSet);
        System.out.println(namesSet.size());
    }
}
