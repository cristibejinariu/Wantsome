package week3.inheritance;

public class Bird extends Animal{
    public static boolean canFly = true;
    public boolean canSwim = true;

    public Bird(String name, int age, double weight) {
        super(name, age, weight);
    }

    public static void printClassName(){
        System.out.println("BIRD");
    }

    public static void main(String[] args) {
        Bird b1 = new Bird("Ciupica", 1, 11);
        Bird b2 = new Bird("Aurica", 2, 22);

        System.out.println("Ciupiuca.canFly: " + b1.canFly);
        System.out.println("Aurica.canFly: " + b2.canFly);
        System.out.println("Ciupiuca.canSwim: " + b1.canSwim);
        System.out.println("Aurica.canSwim: " + b2.canSwim);

        System.out.println("---------");
        b1.canSwim = false;
        System.out.println("Ciupica.canSwim: " + b1.canSwim);
        System.out.println("Aurica.canSwim: " + b2.canSwim);

        System.out.println("---------");
        b1.canFly = false;
        System.out.println("Ciupica.canFly: " + b1.canFly);
        System.out.println("Aurica.canFly: " + b2.canFly);

        Bird.canFly = true;
        System.out.println("Pot pasarile zbura? " + Bird.canFly);

        b1.printClassName();        // pot face asta
        Bird.printClassName();      // dar mai degraba asa
    }
}
