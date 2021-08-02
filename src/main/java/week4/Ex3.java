package week4;

import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Xenia");
        names.add("Ricky");
        names.add("Yolanda");
        names.add("Carla");
        names.add("Gimmy");
        names.add("W");
        names.add("Zelda");

        Set<String> namesSet = new TreeSet<>();
        for (String studenti : names) {
            namesSet.add(studenti);
        }

        System.out.println(namesSet);
        System.out.println(namesSet.size());
        System.out.println();
        System.out.println("================================");
        System.out.println();

        List<String> students = new ArrayList<>(names);

        for(String nume : students){
            if((nume.length()<2) || (nume.toLowerCase().startsWith("x") || (nume.toLowerCase().startsWith("y") || (nume.toLowerCase().startsWith("z"))))){
                names.remove(nume);
            }
        }
        System.out.println(names);
        System.out.println(names.size());
    }
}

