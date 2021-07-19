package week1;

public class Employee {

    Employee managerDirect;
    String nume;
    int vechimeInFirma; // = 0;
    boolean esteInFirma; // = false;

    int varsta = 18;

    public void printDescription() {

        System.out.println("Nume angajat: " + nume
                + ". Vechime: " + vechimeInFirma
                + ". Mai este in firma in prezent? " + esteInFirma
                + ". Varsta = " + varsta);
    }

    public String getDescription() {

        return "Nume angajat: " + nume
                + ". Vechime: " + vechimeInFirma
                + ". Mai este in firma in prezent? " + esteInFirma
                + ". Varsta = " + varsta;
    }
}
