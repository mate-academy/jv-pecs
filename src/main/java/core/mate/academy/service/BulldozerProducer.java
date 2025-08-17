package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> bulldozers;

    public BulldozerProducer() {
        bulldozers = new ArrayList<>();
    }

    @Override
    public List<Bulldozer> get() {
        bulldozers.add(Bulldozer.of(650,"Tires"));
        bulldozers.add(Bulldozer.of(1000,"Track(Caterpillar)"));
        return bulldozers;
    }
}
