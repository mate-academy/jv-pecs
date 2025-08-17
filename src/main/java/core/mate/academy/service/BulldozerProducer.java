package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

class BulldozerProducer implements MachineProducer<Bulldozer> {
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        for (int i = 0; i < MACHINE_QUANTITY; i++) {
            bulldozers.add(new Bulldozer());
        }
        return bulldozers;
    }
}
