package core.mate.academy.model;

public class Truck extends Machine {
    private int weightOfTheLoad;
    private String typeBySize;

    public Truck() {
    }

    public Truck(String color, String name, int weightOfTheLoad, String typeBySize) {
        setColor(color);
        setName(name);
        this.weightOfTheLoad = weightOfTheLoad;
        this.typeBySize = typeBySize;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
