package core.mate.academy.model;

import java.util.List;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double caterpillarLength;

    public Excavator() {
    }

    public Excavator(double caterpillarLength) {
        this.caterpillarLength = caterpillarLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public List<Machine> get() {
        Excavator twoMExcavator = new Excavator(2);
        Excavator twoAndHalfMExcavator = new Excavator(2.5);
        return List.of(twoMExcavator, twoAndHalfMExcavator);
    }

    public double getCaterpillarLength() {
        return caterpillarLength;
    }

    public void setCaterpillarLength(double caterpillarLength) {
        this.caterpillarLength = caterpillarLength;
    }
}
