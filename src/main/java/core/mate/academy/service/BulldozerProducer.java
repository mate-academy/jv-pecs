package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer(200,"RHT"));
        bulldozers.add(new Bulldozer(220,"ADT"));
        bulldozers.add(new Bulldozer(250,"AUD"));
        return bulldozers;
    }
}
