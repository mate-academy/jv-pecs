package core.mate.academy.model;

import java.util.List;
/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */

public class Excavator extends Machine {
    private String model;

    public Excavator() {
    }

    public Excavator(String name, String color, String model) {
        super(name, color);
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
        System.out.println("Excavator started to work");
    }

    @Override
    public List<? extends Machine> get() {
        Excavator firstExcavator = new Excavator("John Deere", "White", "75G");
        Excavator secondExcavator = new Excavator("John Deere", "85G", "Green");
        Excavator thirdExcavator = new Excavator("John Deere", "130G", "Purpule");

        return List.of(firstExcavator, secondExcavator, thirdExcavator);
    }
}
