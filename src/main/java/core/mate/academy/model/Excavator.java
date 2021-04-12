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
        super(model, color);
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
    public List<Machine> get() {
        Excavator cat = new Excavator("Cat","Yellow","245ME");
        Excavator volvo = new Excavator("Volvo", "Blue", "EC140E");
        Excavator tmc = new Excavator("TMC", "Black", "Hitachi");
        return List.of(cat, volvo, tmc);
    }
}
