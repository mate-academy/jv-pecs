package core.mate.academy.model;

import core.mate.academy.enums.ExcavatorUsage;

public class Excavator extends Machine {
    private ExcavatorUsage usage;

    public Excavator() {
    }

    public Excavator(ExcavatorUsage usage) {
        this.usage = usage;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
