package core.mate.academy.model;

import core.mate.academy.service.ExcavatorProducer;
import core.mate.academy.service.MachineProducer;

import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String name;
    private String color;

    public Excavator() {
    }

    public Excavator(String name, String color) {
        this.color = color;
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
