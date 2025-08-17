package core.mate.academy.model;

public class Truck extends Machine {
    private int lengthTrailer;

    public Truck() {
    }

    public Truck(String name, String color, int lengthTrailer) {
        super(name, color);
        this.lengthTrailer = lengthTrailer;
    }

    public int getLengthTrailer() {
        return lengthTrailer;
    }

    public void setLengthTrailer(int lengthTrailer) {
        this.lengthTrailer = lengthTrailer;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
