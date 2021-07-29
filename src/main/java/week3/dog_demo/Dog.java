package week3.dog_demo;

public class Dog {
    // fields
    String name;
    String breed;
    String color;
    int age;

    public Dog(String name, String breed, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    public Dog(){
        breed = "Metis";
        color = "gray";
        age = 1;
    }

    public Dog(String color, String rasa, int varsta){
        breed = rasa;
        age = varsta;
        this.color = color;
    }

    public Dog(String breed){
        this.breed = breed;
        color = "unknown";
        age = 3;
    }

    // methods
    public void bark(){
        System.out.println("Whoof!");
    }

    public void barkMultipleTimes(int noOfTimes){
        for (int i=0; i<noOfTimes; i++){
            // System.out.println("Whoof!");  <- nu ne repetam
            bark();
        }
    }

    public void eat(){
        System.out.println("!!Eating...!!");
    }

    public void run(){
        System.out.println("I am running!");
    }

    public String getInfo(){
        return name + " are rasa: "
                + breed
                + ", culoarea: " + color
                + ", varsta: " + age;
    }
}
