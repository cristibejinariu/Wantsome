package week2;

import week1.Hello;

public class Literals {

    public static void main(String[] args) {

        int suma = Hello.adunareNumere('0', 2);

        System.out.println("Suma dintre un char si un int este:"
                + suma  );

        int oVariabila = 3;
        int suma2 = Hello.adunareNumere(0, oVariabila );

        Hello.adunareNumere(10, 5 );
    }
}
