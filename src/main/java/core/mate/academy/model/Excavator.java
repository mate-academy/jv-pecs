package core.mate.academy.model;

import java.util.ArrayList;
import java.util.List;

public class Excavator extends Machine {
    private static final String EXCAVATOR_UNIQUE_FIELD = "excavator";
    private List<Excavator> excavatorStorage = new ArrayList<>();

    public Excavator() {
    }

    public List<Excavator> readStorage() {
        return excavatorStorage;
    }

    public void putItemToStorage(Excavator excavator) {
        excavatorStorage.add(excavator);
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
