package core.mate.academy.model;

public class Truck extends Machine {
    private int valveBox;

    public Truck(String name, String color, int valveBox) {
        super(name, color);
        this.valveBox = valveBox;
    }

    public Truck() {
        super();
    }

    public int getValveBox() {
        return valveBox;
    }

    public void setValveBox(int valveBox) {
        this.valveBox = valveBox;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
