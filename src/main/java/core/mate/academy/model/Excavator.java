package core.mate.academy.model;

import java.util.ArrayList;
import java.util.List;

public class Excavator extends Machine {
    private static final int COUNT_EXCAVATORS = 3;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        for (int i = 0; i < COUNT_EXCAVATORS; i++) {
            excavators.add(new Excavator());
        }
        return excavators;
    }
}
