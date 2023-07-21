package core.mate.academy.implementation;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozeProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_CAR; i++) {
            bulldozers.add(new Bulldozer());
        }
        return bulldozers;
    }
}
