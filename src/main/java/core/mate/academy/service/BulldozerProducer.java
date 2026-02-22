package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int BULLDOZER_AMOUNT = 3;

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();

        for (int i = 0; i < BULLDOZER_AMOUNT; i++) {
            Bulldozer bulldozer = createMachine(
                    "B- " + i,
                    i % 2 == 0 ? "red" : "yellow"
            );
            list.add(bulldozer);
        }

        return list;
    }

    private Bulldozer createMachine(String name, String color) {
        Bulldozer bulldozer = new Bulldozer();
        bulldozer.setName(name);
        bulldozer.setColor(color);

        return bulldozer;
    }
}
