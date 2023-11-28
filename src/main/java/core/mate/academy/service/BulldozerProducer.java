package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        ArrayList<Bulldozer> machines = new ArrayList<>();
        for (int i = 0; i < MACHINES_NUMBER; i++) {
            machines.add(new Bulldozer());
        }
        return machines;
    }
}
