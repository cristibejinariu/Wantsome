package week3.dogDemo;

public class DogApplication {
    public static void main(String[] args) {
        Dog grivei = new Dog();
        System.out.println("Grivei are rasa: "
                + grivei.breed
                + ", culoarea: "+ grivei.color
                + ", varsta: " + grivei.age);

        Dog azorel = new Dog("Alb cu pete negre", "Ciobanesc", 10);
        azorel.name = "Azorel";
        System.out.println("Azorel are rasa: "
                + azorel.breed
                + ", culoarea: "+ azorel.color
                + ", varsta: " + azorel.age);

        Dog ricky = new Dog("Husky");
        ricky.name = "Ricky";
        System.out.println("Ricky are rasa: "
                + ricky.breed
                + ", culoarea: "+ ricky.color
                + ", varsta: " + ricky.age);

        Dog rex = new Dog("Rex", "bulldog", "black", 3);
        System.out.println(rex.getInfo());

        grivei.bark();
        azorel.bark();
        System.out.println("------------");
        ricky.barkMultipleTimes(4);
        System.out.println(grivei.getInfo());
        System.out.println(ricky.getInfo());
    }
}
