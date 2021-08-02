package week4;

import java.util.ArrayList;
import java.util.List;

public class Week4ex1 {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(10);
        grades.add(7);
        grades.add(6);
        grades.add(9);
        grades.add(8);
        grades.add(4);

        int minim = grades.get(0);
        for (Integer nota : grades) {
            if (nota < minim) {
                minim = nota;
            }
        }

        System.out.println("Minim este: " + minim);

        int maxim = grades.get(0);
        for (Integer nota : grades) {
            if (nota > maxim) {
                maxim = nota;
            }
        }

        System.out.println("Maxim este: " + maxim);

        int sum = 0;
        for (Integer nota : grades) {
            sum = sum + nota;
        }
        System.out.println("Average: " + (double)sum/grades.size());
    }
}

