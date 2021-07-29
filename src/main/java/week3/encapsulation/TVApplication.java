package week3.encapsulation;

public class TVApplication {
    public static void main(String[] args) {
        TV myTv = new TV("LG", 100, "curved", 2016);

        System.out.println("Brandul televizorului este: " + myTv.getBrand());
        myTv.setBrand("Samsung");
        System.out.println("Brandul televizorului dupa modificare este: " + myTv.getBrand());

        System.out.println("Dimensiunea: " + myTv.getSize());
        myTv.setSize(-1);
        System.out.println("Dimensiunea: " + myTv.getSize());
        myTv.setSize(150);
        System.out.println("Dimensiunea: " + myTv.getSize());
    }
}
