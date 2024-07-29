package Sandbox;

import COW8.Intake;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import static COW12.RandomStuff.*;
import static COW12.RandomStuff.randomLowerCaseLetter;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Honda", 1.2, 2,2);
        Bicycle bike = new Bicycle("My Bike", 1.2, 2, 3);

        bike._pedals = 0;

        car.go();
        bike.stop();

        //System.out.println(car.doors);
        //System.out.println(bike.pedals);

    }
}