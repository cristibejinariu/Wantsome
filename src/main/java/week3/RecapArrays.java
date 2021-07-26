package week3;

import java.util.Arrays;
import java.util.Locale;

public class RecapArrays {
    public static void main(String[] args) {

        int[] numere = new int[20]; // declarat si initializat un array de 20 de pozitii
        double[] numere2 = new double[2]; // [0.0] [0.0] <- valorile
        boolean[] booleans = new boolean[1]; // [false] <- valorile

        String[] studenti = {"Serjio", "Gimmy", "Annie", "Marco"}; // array cu 4 pozitii, si valorile respective

        // vreau sa accesez al 3lea element
        int alTreilea = numere[2]; // pt ca primul index e 0

        // vreau sa printez toti studentii
        for(int i=0; i< studenti.length; i++) {
            System.out.println(studenti[i]);
        }

        System.out.println("-=-=-=-=-=-=-");

        for(String xyz : studenti) {
            System.out.println(xyz);
        }

        System.out.println("-=-=-=-=-=-=-");
        System.out.println(studenti);
        System.out.println(Arrays.toString(studenti));

        String[] totStudenti = {"Serjio", "Gimmy", "Annie", "Marco"};

        if(studenti == totStudenti){
            System.out.println("Sunt egale!!");
        } else {
            System.out.println("Nu sunt egale!! :/");
        }

        System.out.println("----Arrays.equals----");
        if(Arrays.equals(studenti, totStudenti)){
            System.out.println("Sunt egale!!");
        } else {
            System.out.println("Nu sunt egale!! :/");
        }

        double[] numereCuVirgula = new double[25];
        System.out.println(Arrays.toString(numereCuVirgula));
        Arrays.fill(numereCuVirgula, 9.3234);
        System.out.println(Arrays.toString(numereCuVirgula));

        System.out.println(Arrays.toString(studenti));
        Arrays.sort(studenti);
        System.out.println(Arrays.toString(studenti));

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {2, 4, 7};
        int[] arr4 = arr3;

        System.out.println("arr1: " + arr1); // solutia -> folosind ArraystoString
        System.out.println("arr2: " + arr2);
        System.out.println("arr3: " + arr3);
        System.out.println("arr4: " + arr4);

        System.out.println("arr1 == arr2: " + (arr1 == arr2));
        System.out.println("arr2 == arr3: " + (arr2 == arr3));
        System.out.println("arr3 == arr4: " + (arr3 == arr4));

        String s1 = "abc";
        String s2 = "abc";
        String s3 = "ABC".toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("s1 == s2 -> " + (s1 == s2));
        System.out.println("s2 == s3 -> " + (s2 == s3));
        System.out.println("s1.equals(s2) " + s1.equals(s2));
        System.out.println("s2.equals(s3) " + s2.equals(s3));

        String[] words = new String[10];
        System.out.println(Arrays.toString(words));
    }
}
