package week3.inheritance;

public class Tiger extends Animal {

    private int noOfStripes;

    public Tiger(String name, int age, double weight, int noOfStripes){
        super(name, age, weight);
        this.noOfStripes = noOfStripes;
    }

    public void run(){
        System.out.println("I am running very fast");
    }

    public void eat(String food){
        System.out.println("I am eating: " + food);
    }
}
