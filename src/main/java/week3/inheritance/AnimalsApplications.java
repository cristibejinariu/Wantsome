package week3.inheritance;

public class AnimalsApplications {
    public static void main(String[] args) {
        Bear b1 = new Bear("Fram", 20, 300, "romanian");
        Tiger t1 = new Tiger("Tigrisor", 5, 150, 40);

        System.out.println(b1.getName());

        b1.eat();

        System.out.println("------------");

        System.out.println(t1.getName());

        t1.run();

        t1.eat();

        t1.eat("pizza");
    }
}
