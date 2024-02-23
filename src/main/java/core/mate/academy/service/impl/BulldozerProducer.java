package core.mate.academy.service.impl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final List<Bulldozer> bulldozers = new ArrayList<>();

    @Override
    public List<Bulldozer> get() {
        fillTheListOfBulldozers();
        return new ArrayList<>(bulldozers);
    }

    private void fillTheListOfBulldozers() {
        bulldozers.add(new Bulldozer("TR1", "black",
                12, 5));
        bulldozers.add(new Bulldozer("TR2", "Grey",
                13, 6));
    }
}
