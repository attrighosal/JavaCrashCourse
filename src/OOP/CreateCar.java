package OOP;

public class CreateCar {

    public static void main(String[] args) {
        Car car = new Car(4,4,4, "Green");
        Car car2 = new Car(4, 6, 6, "Blue");

        car.display();
        car.accelerate(50);

        SUV innova = new SUV(4, 6, 5, "Gold", 7);
        innova.display();
    }
}
