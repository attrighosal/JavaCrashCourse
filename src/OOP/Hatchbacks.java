package OOP;

public class Hatchbacks extends Car {

    private int mileAge;

    public Hatchbacks(int tyres, int windows, int doors, String color, int mileAge) {
        super(tyres, windows, doors, color);
        this.mileAge = mileAge;
    }

    public void display() {
        System.out.println("Car = tyres:"+getTyres()+", windows:"+getWindows()+", doors:"+getDoors()+", color:"+getColor()+", mileAge:"+mileAge);
    }
}
