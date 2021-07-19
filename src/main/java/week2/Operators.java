package week2;

public class Operators {
    public static void main (String[] arg) {
        demoAritmeticOperations();
        demoRelationOperations();
        demoLogicalOperations();
        assignmentOperators();
    }

    private static void assignmentOperators() {
        int a = 8;
        a+=2; // a = a+2
        System.out.println("a+=2    a=" + a);

        a*=5; // a = a*5
        System.out.println("a*=5    a=" + a);
    }

    private static void demoLogicalOperations() {
        int a = 7;
        boolean isEqual = 7==a;

        System.out.println("Not operation: " + !isEqual);
        System.out.println("isEqual: " + isEqual);

        boolean eCaldAfara = true;
        boolean amTimpLiber = true;
        boolean mergLaPlimbare = eCaldAfara && amTimpLiber;

        System.out.println("Merg la plibare? " + mergLaPlimbare);

        boolean miePoftaDeCevaDulce = false;
        boolean manancInghetata = eCaldAfara || miePoftaDeCevaDulce;

        System.out.println("Inghetata? " + manancInghetata);

        boolean amInghetataInFrigider = true;

        manancInghetata = miePoftaDeCevaDulce ? amInghetataInFrigider : true;
        // manancInghetata = (evalueazaExpresie) ? rezultat in caz de True : rezultat in caz de False

        System.out.println("Inghetata? Decizie " + manancInghetata);

        boolean amBani = false;
        manancInghetata = (eCaldAfara || miePoftaDeCevaDulce) && amBani;

        System.out.println("Inghetata? " + manancInghetata);
    }

    private static void demoRelationOperations() {
        int a = 7;
        boolean suntEgale = 7==a;
        boolean inegal = 8 !=a;
        boolean isGreater = 9>a;
        boolean isGreaterOrEqual = 7>=a;

        System.out.println("Relational == " + suntEgale);
        System.out.println("Relational != " + inegal);
        System.out.println("Relational > " + isGreater);
        System.out.println("Relational >= " + isGreaterOrEqual);
    }

    private static void demoAritmeticOperations() {
        int s = 2-3;
        int d = 10/3;

        System.out.println("d:" + d);

        double d2 = (double) 10/3;

        System.out.println("d2: " + d2);

        int r = 10%3;

        System.out.println("r: " + r);

        r++;    // echivalent cu r = r + 1

        System.out.println("r dupa r++: " + r);

        d--;

        System.out.println("d dupa d--: " + d);
    }
}
