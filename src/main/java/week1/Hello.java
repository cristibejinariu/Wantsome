package week1;

public class Hello {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Va salut!!");
        System.out.println();

        System.out.println("------------------------------");

        System.out.println("Text line 1");
        System.out.print("Text line 2/1 + ");
        System.out.println("Text line 2/2");


        System.out.println("------------------------------");
        System.out.println();

        String nume = "World";
        nume = "Branzescu";

        System.out.println("Salut " + nume + "!!");

        nume = "Lupu";
        System.out.println("Salut " + nume + "!!");

        int varsta = 30;

        double pi = 3.14;

        varsta = 35;

        System.out.println(varsta);

        String myName = "Cristi";
        String myName2 = "Bejinariu";

        final int kg = 15; // final -> permite o singura asignare
        // kg = 10; cannot assign it again

        String[] names = new String[5];

        names[0] = "Nelu";
        names[1] = "Gelu";
        names[3] = "Mircea";
        names[4] = "Muc";
        // names[5] = "Vica"; // ArrayIndexOutOfBoundsException

        System.out.println("Al 5lea nume din sir este: " + names[4]);

        int sumaADouaNumere = adunareNumere(7, kg);

        System.out.println("Suma: " + sumaADouaNumere);

        System.out.println(adunareNumere(4416, 973));

        System.out.println(adunareNumere(adunareNumere(2,5), 3));
    }

    public static int adunareNumere(int a, int b){
        int suma = a+b;

        return suma; // return a + b;
    }

    public static int adunareNumere(int a, int b, int c, String msg) {
        int suma = a + b + c;

        System.out.println(msg + suma );

        return suma;
    }
}
