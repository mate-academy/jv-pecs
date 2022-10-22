package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.LinkedList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int LIST_SIZE = 3;

    @Override
    public List<? extends Bulldozer> get() {
        List<Bulldozer> bulldozers = new LinkedList<>();
        for (int i = 0; i < LIST_SIZE; i++) {
            bulldozers.add(new Bulldozer());
        }
        return bulldozers;
    }
}
