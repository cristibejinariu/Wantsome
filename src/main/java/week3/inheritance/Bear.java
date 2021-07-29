package week3.inheritance;

public class Bear extends Animal {

    private String nationality;

    public Bear(String name, int age, double weight, String nationality){
        super(name, age, weight);
        this.nationality = nationality;
    }
    public String getName() {
        return this.name;
    }
}
