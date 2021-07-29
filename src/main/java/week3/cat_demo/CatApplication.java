package week3.cat_demo;

public class CatApplication {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        // cu variabila
        cat1.age = 21;
        System.out.println(cat1.meow());

        // fara variabila
        System.out.println(new Cat().meow());
        System.out.println(new Cat("Lola").name);

        cat2.makePlayfulSound();

        // cat2.noOfOwners = 2; // nu pot face ca e private
        System.out.println(cat2.notSoSecret);
    }
}
