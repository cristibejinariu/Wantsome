package week4;

import java.util.*;

public class SetsDemo {
    public static void main(String[] args) {
        // Set<String> myNames = new LinkedHashSet<>();  // listare dupa ordinea de insertie
        // Set<String> myNames = new TreeSet<>(); // listare dupa alfabet
        Set<String> myNames = new HashSet<>();
        System.out.println("Dimensiunea: " + myNames.size());
        myNames.add("John");
        myNames.add("Mary");
        myNames.add("Jack");
        myNames.add("John");
        System.out.println(myNames);
        System.out.println("Dimensiunea dupa add: " + myNames.size());
        System.out.println("Setul contine Mary: " + myNames.contains("Mary"));
        myNames.remove("Mary");
        System.out.println("Setul contine Mary (dupa remove): " + myNames.contains("Mary"));

        //parcurgere set
        for (int i=0; i<myNames.size(); i++){
            //nu pot face myNames.get(index);
        }

        for(String nume: myNames){
            System.out.println(nume);
        }

        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(5);
        System.out.println("Dimensiunea liste: " + numbersList.size());
        System.out.println(numbersList);

        //vreau sa elimin duplicatele
        Set<Integer> numbersSet = new HashSet<>();
        for(Integer x : numbersList){
            numbersSet.add(x);
        }
        System.out.println(numbersSet);

        //sau pe scurt
        Set<Integer> numbersSet2 = new HashSet<>(numbersList);

        int[] myArr = {1, 2, 3, 4, 5};
        System.out.println(myArr);
    }
}
