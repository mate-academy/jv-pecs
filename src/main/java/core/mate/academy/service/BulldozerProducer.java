package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> produce() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer());
        bulldozers.get(0).setId(0);
        bulldozers.get(0).setName("Bully");
        bulldozers.add(new Bulldozer());
        bulldozers.get(1).setId(1);
        return bulldozers;
    }
}
