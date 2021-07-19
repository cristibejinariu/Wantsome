package week2;

public class WhileDemo {

    public static void main(String[] args) {

        int i=1;

        while (i<=10) {
            System.out.println("i: " + i);
            i++; // i = i+1
        }

        System.out.println("After while loop i is: " + i);

        System.out.println("-------------------------------------------------");

        int[] numbers = {7, 30, 12, 50, 20};

        int max = numbers[0];
        int pozitia = 1;

        while (pozitia <=4) {
            // comparatia
            // noul maxim, daca este cazul

            System.out.println("Numarul curent comparat este: " + numbers[pozitia] + " de pe pozitia: " + pozitia);

            if (numbers[pozitia] > max) {
                max = numbers[pozitia];
            }
            pozitia++;
        }

        System.out.println("Max este: " + max);
    }
}
