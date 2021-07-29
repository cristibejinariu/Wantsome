package week3.cat_demo;

public class Cat {
    String name;
    int age;
    public String breed;
    private int noOfOwners;
    protected String notSoSecret = "asd";

    public Cat(){}

    public Cat(String name){
        this.name = name.toUpperCase() + " Meow";
    }
    public Cat(String name, int age){
        this(name); // apelam constructorul care primeste doar un parametru String
        // continuam cu logica specifica a constructorului curent
        this.age = age;
    }

    public String meow(){
        return  "Meow";
    }

    public void play(){
        System.out.println("I am playing");
        makePlayfulSound();
        System.out.println("I have " + noOfOwners + " owners.");
    }

    public  void makePlayfulSound(){
        System.out.println("Yuppy!");
    }
}
