package week1;

public class PrimitivesVsNonPrimitives {

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.nume = "Catalina";
        employee1.vechimeInFirma = 3;
        employee1.esteInFirma = true;

        employee1.printDescription();

        Employee employee2 = new Employee();

        employee2.nume = "Razvan";
        employee2.vechimeInFirma = 4;
        employee2.esteInFirma = false;

        employee2.printDescription();

        byte a = 5;

        boolean isReady = true;

        char litera = 'w';
        char litera2 = '$';

        Employee employee3 = new Employee();

        employee3.nume = "Simona";
        employee3.vechimeInFirma = 7;
        employee3.esteInFirma = true;
        employee3.varsta = 25;

        employee3.printDescription();

        Employee employee4 = new Employee();

        employee4.printDescription();

        employee3.managerDirect = employee1;

        System.out.println("Managerul lui empl 3 este: "
                + employee3.managerDirect.getDescription());
    }
}
