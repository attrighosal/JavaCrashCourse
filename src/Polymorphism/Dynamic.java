package Polymorphism;

import OOP.Car;
import OOP.Hatchbacks;
import OOP.SUV;

public class Dynamic {

    public static void main(String[] args) {


        Car normalCar = new Car(4,4,4,"Blue");

        Car scorpio = new SUV(4,6,6,"Green", 7);

        scorpio.display();
        normalCar.display();

        Car hatchbackCar = new Hatchbacks(4,4,4,"White", 20);
        hatchbackCar.display();

    }
}
