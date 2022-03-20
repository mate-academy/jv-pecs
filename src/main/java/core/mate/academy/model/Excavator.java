package core.mate.academy.model;

import java.util.ArrayList;
import java.util.List;

public class Excavator extends Machine {
    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        for (int i = 0;i < excavators.size();i++) {
            excavators.add(null);
        }
        return excavators;
    }
}
