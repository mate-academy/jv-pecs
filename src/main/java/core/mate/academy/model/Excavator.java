package core.mate.academy.model;

import core.mate.academy.enums.ExcavatorUsage;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
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
