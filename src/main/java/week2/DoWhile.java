package week2;

public class DoWhile {
    public static void main(String[] args) {
        int i = 1; // initialization (before loop)

        do {
            System.out.println("i: " + i);
            i++; // increment logic (manual, in loop)
        } while (i < 0);

        System.out.println("After do-while loop i is: " + i);

        int age = 1; // initialization (before loop)

        do {
            System.out.println("Persoana este minora. Age: " + age);
            age++; // increment logic (manual, in loop)
        } while (age < 18);

        System.out.println("After do-while loop age is: " + age);

    }
}
