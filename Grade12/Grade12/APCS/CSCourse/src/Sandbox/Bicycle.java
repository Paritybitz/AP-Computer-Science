package Sandbox;

public class Bicycle extends Vehicle {
    protected int _wheels;
    protected int _pedals;

    public Bicycle (String name, double speed, int wheels, int pedals){
        super(name, speed);

        _wheels = wheels;
        _pedals = pedals;
    }
}
