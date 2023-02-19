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

    @Override
    public List<Excavator> get() {
        List<Excavator> listOfExcavators = new ArrayList<>();
        for (int i = 0; i < COUNT_OF_MACHINES; i++) {
            listOfExcavators.add(new Excavator());
        }
        return listOfExcavators;
    }
}
