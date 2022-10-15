package OOP;

public class SUV extends Car {

    private int seats;

    public SUV(int tyres, int windows, int doors, String color, int seats) {
        super(tyres, windows, doors, color);
        this.seats = seats;
    }
}
