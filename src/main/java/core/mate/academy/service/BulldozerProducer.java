package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer(400, 150.3, true));
        bulldozers.add(new Bulldozer(450, 170.6, false));
        bulldozers.add(new Bulldozer(490, 190.9, true));

        return bulldozers;
    }
}
