package week4;

import java.util.ArrayList;
import java.util.List;

public class ListsDemo {
    public static void main(String[] args) {
        // nu vom putea pune int, boolean, double, char, etc.
        // vom putea lucra cu Integer, Double, Boolean, Character, ..

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Cate elemente am in lista? " + numbers.size());

        // adaugare
        numbers.add(20);
        numbers.add(Integer.valueOf(45));
        numbers.add(Integer.valueOf(60));
        numbers.add(10);
        numbers.add(-1);
        numbers.add(10);

        System.out.println("Cate elemente am in lista? (2nd) " + numbers.size());

        // citire din lista
        System.out.println("Primul element din lista: " + numbers.get(0));
        System.out.println("Ultimul element din lista: " + numbers.get(numbers.size()-1));

        // parcurgere lista - 0 -> number.size()-1
        for (int i=0; i<numbers.size(); i++){
            System.out.println("La indexul " + i + " avem elentul " + numbers.get(i));
        }

        // adauga element pe indexul 0 si le muta pe celelalte mai la dreapta
        numbers.add(0,9999);
        for (int i=0; i<numbers.size(); i++){
            System.out.println("La indexul " + i + " avem elentul " + numbers.get(i));
        }

        // inlocuire element
        numbers.set(0, 1);
        System.out.println("Primul element este acum: " + numbers.get(0));
        System.out.println("============");
        numbers.remove(1); // nu mai transforma in Integer
        for (int i=0; i<numbers.size(); i++){
            System.out.println("La indexul " + i + " avem elentul " + numbers.get(i));
        }
        numbers.remove(Integer.valueOf(45));

        List<String> names = new ArrayList<>();
        names.add("Mary");
        names.add("Anne");
        names.add("Sam");
        names.add("John");
        names.add("Alex");

        System.out.println("names.size() => " + names.size()); // 5
        names.remove("Sam");
        System.out.println("names.size() => " + names.size()); // 4
        for (int i=0; i<names.size(); i++){
            System.out.println(names.get(i));
        }
        System.out.println("----------");
        names.remove(2); // il elimin pe John
        for (int i=0; i<names.size(); i++){
            System.out.println(names.get(i));
        }
        System.out.println("names.size() => " + names.size()); // 3

        names.remove("Blablabla");

        System.out.println("In lista de nume avem Carl? " + names.contains("Carl"));
        System.out.println("In lista de nume avem Alex? " + names.contains("Alex"));

        names.add("Mary");
        System.out.println("Prima ocurenta a lui Mary: " + names.indexOf("Mary"));
        System.out.println("Ultima ocurenta a lui Mary: " + names.lastIndexOf("Mary"));
        System.out.println("Prima ocurenta a lui Jack: " + names.indexOf("Jack"));

        names.clear();
        System.out.println("Dupa clear, dimensiunea este: " + names.size());
    }
}
