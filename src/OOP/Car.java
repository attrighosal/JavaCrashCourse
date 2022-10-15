package OOP;

public class Car {

    // Properties
    private int tyres;
    private int windows;
    private int doors;
    private String color;
    private int speed;

    // Constructor
    public Car(int tyres, int windows, int doors, String color) {
        this.tyres = tyres;
        this.windows = windows;
        this.doors = doors;
        this.color = color;
        this.speed = 0;
    }

    // Behaviours
    public void accelerate(int increasedSpeed) {
        speed += increasedSpeed;
    }

    void display() {
        System.out.println("Car = tyres:"+tyres+", windows:"+windows+", doors:"+doors+", color:"+color);
    }
}


