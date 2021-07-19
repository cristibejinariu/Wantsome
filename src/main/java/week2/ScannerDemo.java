package week2;

import java.util.Scanner;

public class ScannerDemo {
    public static void main (String[] args) {
        String name = readName();
        sayHi(name);
    }
    static String readName() {
        System.out.println("Enter your name: ");
        Scanner in = new Scanner(System.in);
        return in.next();
    }
    static void sayHi(String name) {
        System.out.println("Salut, " + name + "!");
    }
}
