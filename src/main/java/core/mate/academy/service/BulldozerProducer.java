package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.LinkedList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new LinkedList<>();
        bulldozers.add(new Bulldozer("RoadGrapper", "yellow", 10000.0));
        bulldozers.add(new Bulldozer("Ripper", "white", 25000.0));
        bulldozers.add(new Bulldozer("LittleBill", "green", 4000.0));
        return bulldozers;
    }
}
