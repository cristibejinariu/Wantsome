package week2;

public class Arrays {
    public static void main(String[] args) {

        int[] arrayOfInts = new int[5];

        String[] names = new String[]{"Bica", "Haurentiu", "Silviu"};

        double[] note = {8.4, 6.6, 10.0};

        System.out.println();

        System.out.println("Prima nota: " + note[0]);

        System.out.println();

        System.out.println("Al 3-lea nume: " + names[2]);

        System.out.println();

        printareNume(names);

        names[2] = "Razvan";

        System.out.println("================");

        printareNume(names);

        System.out.println();

        for (int i = 0; i < arrayOfInts.length; i++) {
            System.out.println("Int-ul de pe pozitia: " + i + " este: " + arrayOfInts[i]);
        }
    }

    private static void printareNume(String[] names) {

        for (int i = 0; i < names.length; i++) {

            System.out.println("Nume: " + names[i]);
        }
    }
}
