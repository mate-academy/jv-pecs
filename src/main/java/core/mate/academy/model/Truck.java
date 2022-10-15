package core.mate.academy.model;

public class Truck extends Machine {
    private String trailerColor;
    private int trailerWeight;

    public Truck() {
    }

    public Truck(String name, String color, String trailerColor, int trailerWeight) {
        super(name, color);
        this.trailerColor = trailerColor;
        this.trailerWeight = trailerWeight;
    }

    public String getTrailerColor() {
        return trailerColor;
    }

    public void setTrailerColor(String trailerColor) {
        this.trailerColor = trailerColor;
    }

    public int getTrailerWeight() {
        return trailerWeight;
    }

    public void setTrailerWeight(int trailerWeight) {
        this.trailerWeight = trailerWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
