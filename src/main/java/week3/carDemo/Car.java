package week3.carDemo;

public class Car {
    String brand;
    int numberOfDoors;
    String color;
    Engine motor;
    Wheel[] wheels;

    public void start(){
        System.out.println("Starting the car...");
    }
    public void stop(){
        System.out.println("Stopping the car...");
    }
    public void turnRight (){
        System.out.println("Turning right...");
        System.out.println(motor.slowDown());
    }
    public void turnLeft (){
        System.out.println("Turning left...");
        System.out.println(motor.slowDown());
    }
}
