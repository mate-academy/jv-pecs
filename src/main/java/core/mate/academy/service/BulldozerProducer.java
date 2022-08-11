package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        Bulldozer firstbulldozer = new Bulldozer();
        Bulldozer secondbulldozer = new Bulldozer();
        firstbulldozer.setYear(1990);
        secondbulldozer.setWeight(23);
        bulldozers.add(firstbulldozer);
        bulldozers.add(secondbulldozer);
        return bulldozers;
    }
}
