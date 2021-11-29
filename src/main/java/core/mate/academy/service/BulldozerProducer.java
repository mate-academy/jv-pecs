package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer(1952, 41));
        bulldozers.add(new Bulldozer(4561, 35));
        bulldozers.add(new Bulldozer(6514, 45));
        return bulldozers;
    }
}
