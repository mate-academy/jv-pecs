package core.mate.academy.model;

import java.util.List;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String model;

    public Truck() {
    }

    public Truck(String name, String color, String model) {
        super(name,color);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public List<Machine> get() {
        Truck ford = new Truck("Ford", "Blue", "Ford F-150");
        Truck gmc = new Truck("GMC", "Grey", "Canyon");
        Truck ram = new Truck("RAM", "Purple", "1500S");
        return List.of(ford, gmc, ram);
    }
}
