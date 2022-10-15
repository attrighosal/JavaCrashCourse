package OOP;

public class Hatchbacks extends Car {

    private int mileAge;

    public Hatchbacks(int tyres, int windows, int doors, String color, int mileAge) {
        super(tyres, windows, doors, color);
        this.mileAge = mileAge;
    }
}
