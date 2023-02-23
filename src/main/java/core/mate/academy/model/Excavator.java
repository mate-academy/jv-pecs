package core.mate.academy.model;

import core.mate.academy.service.ExcavatorProducer;

public class Excavator extends ExcavatorProducer {
    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
