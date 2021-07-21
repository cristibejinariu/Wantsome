package week2;

public class ForLoop {
    public static void main(String[] args) {

        // afisarea tuturor nr de la 1 la 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("i: " + i);
        }
        // afisarea tuturor nr pare de la 75 la 145

        for (int i = 75; i <= 145; i++) {
            if (i % 2 == 0) {
                System.out.println("Am gasit nr par: " + i);
            }
        }
    }
}
