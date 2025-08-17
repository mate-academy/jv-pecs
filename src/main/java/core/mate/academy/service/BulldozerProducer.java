package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.LinkedList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozerD4 = new Bulldozer("Cat D4", "Yellow", 3196,1600);
        Bulldozer bulldozerD7 = new Bulldozer("Cat D7", "Yellow", 4376,1934);
        List<Bulldozer> bulldozers = new LinkedList<>();
        bulldozers.add(bulldozerD4);
        bulldozers.add(bulldozerD7);
        return bulldozers;
    }
}
