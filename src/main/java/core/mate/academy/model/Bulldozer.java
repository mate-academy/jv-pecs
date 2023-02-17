package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine implements MachineProducer<Bulldozer> {
    private String model;
    private int power;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color,String model, int power) {
        super(name, color);
        this.model = model;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public List<Bulldozer> get() {
        Bulldozer abrams = new Bulldozer("Tank", "Yellow", "M1A1",1500);
        Bulldozer leopard = new Bulldozer("Tank", "Grey","2A5",1500);
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(abrams);
        bulldozers.add(leopard);
        return bulldozers;
    }
}
