package Sandbox;

public class Vehicle extends Thing {
    private double _speed;

    public Vehicle(String name, double speed){
        super(name);

        _speed = speed;
    }

    void go(){
        System.out.println("car is zooming!");
    }
    void stop(){
        System.out.println("applying the brakes...");
    }

}
