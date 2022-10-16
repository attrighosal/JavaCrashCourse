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

    public Car(int tyres, int windows, int doors, String color, int speed) {
        this.tyres = tyres;
        this.windows = windows;
        this.doors = doors;
        this.color = color;
        this.speed = speed;
    }

    // Behaviours
    public void accelerate(int increasedSpeed) {
        speed += increasedSpeed;
    }

    public void display() {
        System.out.println("Car = tyres:"+tyres+", windows:"+windows+", doors:"+doors+", color:"+color);
    }

    public int getTyres() {
        return tyres;
    }

    public int getWindows() {
        return windows;
    }

    public int getDoors() {
        return doors;
    }

    public String getColor() {
        return color;
    }
}


