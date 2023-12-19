package core.mate.academy.model;

public class Truck extends Machine {
    private int length;
    private int seats;

    public Truck() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
