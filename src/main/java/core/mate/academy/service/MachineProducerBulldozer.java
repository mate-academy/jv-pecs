package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class MachineProducerBulldozer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Caterpillar D11", "gray", 13));
        bulldozers.add(new Bulldozer("Comatsu D475", "white", 15));
        bulldozers.add(new Bulldozer("Caterpillar D9", "red", 10));
        return bulldozers;
    }
}
