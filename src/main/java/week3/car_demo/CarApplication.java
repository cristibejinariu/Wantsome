package week3.car_demo;

public class CarApplication {
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.brand = "Tesla";
        myCar.numberOfDoors = 5;
        myCar.color = "Red";
        Engine motorulMeu = new Engine();
        motorulMeu.cubicCapacity = 0.0;
        myCar.motor = motorulMeu;
        myCar.motor.horsePower = 200;
        myCar.wheels = new Wheel[4];
        myCar.wheels[0] = new Wheel();
        myCar.wheels[0].size = 19;
        myCar.wheels[0].category = "Winter";
        myCar.wheels[1] = new Wheel();
        myCar.wheels[2] = new Wheel();
        myCar.wheels[3] = new Wheel();

        myCar.turnRight();
    }
}
