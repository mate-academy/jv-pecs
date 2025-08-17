package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> bulldozers;

    @Override
    public List<Bulldozer> get() {
        bulldozers = new ArrayList<>();
        int index = 0;
        while (index != DEFAULT_MACHINES_AMOUNT) {
            bulldozers.add(new Bulldozer());
            index++;
        }
        return bulldozers;
    }
}
