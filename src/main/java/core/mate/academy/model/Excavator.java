package core.mate.academy.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int diggingDepth;
    private int operatingWeight;

    public Excavator() {
    }

    public Excavator(int diggingDepth, int operatingWeight) {
        this.diggingDepth = diggingDepth;
        this.operatingWeight = operatingWeight;
    }

    public int getDiggingDepth() {
        return diggingDepth;
    }

    public void setDiggingDepth(int diggingDepth) {
        this.diggingDepth = diggingDepth;
    }

    public int getOperatingWeight() {
        return operatingWeight;
    }

    public void setOperatingWeight(int operatingWeight) {
        this.operatingWeight = operatingWeight;
    }

    @Override
    public List<? super Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator());
        excavators.add(new Excavator());
        return excavators;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
