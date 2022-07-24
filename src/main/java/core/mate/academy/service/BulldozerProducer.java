package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;

import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Bulldozer_One", "white", "standard"));
        bulldozers.add(new Bulldozer("Bulldozer_Two", "yellow", "strong"));
        bulldozers.add(new Bulldozer("Bulldozer_Three", "green", "heavy"));
        return bulldozers;
    }
}
