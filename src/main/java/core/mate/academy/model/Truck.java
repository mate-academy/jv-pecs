package core.mate.academy.model;

public class Truck extends Machine {
    private int trailerSize;
    private String driverName;

    public Truck() {
    }

    public Truck(String name, String color, int trailerSize, String driverName) {
        super(name, color);
        this.trailerSize = trailerSize;
        this.driverName = driverName;
    }

    public int getTrailerSize() {
        return trailerSize;
    }

    public void setTrailerSize(int trailerSize) {
        this.trailerSize = trailerSize;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
