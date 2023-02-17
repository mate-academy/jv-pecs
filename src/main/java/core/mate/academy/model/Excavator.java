package core.mate.academy.model;

import java.util.ArrayList;
import java.util.List;

public class Excavator extends Machine {
    private List<Excavator> excavatorStorage = new ArrayList<>();

    public Excavator() {
    }

    public List<Excavator> readStorage() {
        return excavatorStorage;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public void initalizeStorage() {
        excavatorStorage.add(new Excavator());
        excavatorStorage.add(new Excavator());
        excavatorStorage.add(new Excavator());
        excavatorStorage.add(new Excavator());
        excavatorStorage.add(new Excavator());
    }
}
