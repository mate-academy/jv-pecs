package core.mate.academy.service;

import core.mate.academy.model.Excavator;

import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int EXCAVATOR_AMOUNT = 2;

    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();

        for (int i = 0; i < EXCAVATOR_AMOUNT; i++) {
            Excavator excavator = createMachine(
                    "E- " + i,
                    i % 2 == 0 ? "red" : "yellow"
            );
            list.add(excavator);
        }

        return list;
    }

    private Excavator createMachine(String name, String color) {
        Excavator excavator = new Excavator();
        excavator.setName(name);
        excavator.setColor(color);

        return excavator;
    }
}
