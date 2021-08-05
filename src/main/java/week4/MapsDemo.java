package week4;

import java.util.*;

public class MapsDemo {
    public static void main(String[] args) {
        Map<String, Integer> catalog = new HashMap<>();

        System.out.println("Dimensiunea mapului: " + catalog.size());

        catalog.put("Radu", 3);
        System.out.println("Dimensiunea mapului dupa add: " + catalog.size());

        System.out.println(catalog);

        catalog.put("George", 7);
        System.out.println(catalog);

        catalog.put("Mona", 9);
        catalog.put("Eugen", 8);
        catalog.put("Aurel", 10);
        catalog.put("Marcel", 6);

        System.out.println(catalog);

        System.out.println("Ce nota are Radu? " + catalog.get("Radu"));
        System.out.println("Ce nota are Gelu? " + catalog.get("Gelu"));
        System.out.println("Ce nota are Gelu? " + catalog.getOrDefault("Gelu", 5));

        catalog.putIfAbsent("Gelu", 10);
        System.out.println("Ce nota are Gelu? " + catalog.get("Gelu"));

        catalog.remove("Gelu");
        System.out.println("Ce nota are Gelu? " + catalog.get("Gelu"));

        catalog.remove("George");
        System.out.println("Avem nota pt George? " + catalog.containsKey("George"));
        System.out.println("Avem vreun 10? " + catalog.containsValue(10));

        System.out.println("Cheile sunt: ");
        Set<String> numeStudenti = catalog.keySet();
        for(String nume : numeStudenti){
            System.out.println(nume);
        }

        System.out.println("Valorile sunt: ");
        Collection<Integer> note = catalog.values();
        for(Integer nota : note){
            System.out.println(nota);
        }

        for(String nume : catalog.keySet()){
            System.out.println(nume + " are nota " + catalog.get(nume));
        }

    }
}
