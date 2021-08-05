package week4;

import java.sql.Array;
import java.util.*;

public class CollectionsRecap {
    public static void main(String[] args) {
        //lista de stringuri - numele studentilor
        List<String> studentNames = new ArrayList<>();
        studentNames.add("John");
        studentNames.add("Mary");
        studentNames.add("Anne");
        studentNames.add("Helen");

        List<String> shorterStudentNames = Arrays.asList("John", "Mary", "Anne", "Helen");
        System.out.println(shorterStudentNames);

        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add("John");
        uniqueNames.add("Mary");
        uniqueNames.add("Anne");
        uniqueNames.add("Helen");
        System.out.println(uniqueNames);

        Set<String> shorterUniqueNames = new HashSet<>(Arrays.asList("John", "Mary", "Anne", "Helen"));
        System.out.println(shorterUniqueNames);

    }
}
