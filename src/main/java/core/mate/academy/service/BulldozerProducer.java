package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        for (int i = 1; i <= NUMBER_OF_MACHINES; i++) {
            bulldozers.add(new Bulldozer(i, String.valueOf(i), i % 2 == 0));
        }
        return bulldozers;
    }
}
