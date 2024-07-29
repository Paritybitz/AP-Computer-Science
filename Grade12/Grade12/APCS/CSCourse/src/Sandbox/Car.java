package Sandbox;

public class Car extends Vehicle {
    int _wheels = 4;
    int _doors = 4;

    public Car(String name, double speed, int wheels, int doors)
    {
        super(name, speed);

        _wheels = wheels;
        _doors = doors;
    }
}
