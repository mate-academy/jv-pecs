package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.LinkedList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new LinkedList<>();
        final int size = 3;
        for (int i = 0; i < size; i++) {
            bulldozers.add(new Bulldozer(i));
        }

        return bulldozers;
    }
}
