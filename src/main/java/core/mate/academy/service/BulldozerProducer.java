package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer("Caterpillar D10", "yellow", 2000, 300);
        Bulldozer bulldozer2 = new Bulldozer("Komatsu D155 Dozer", "yellow", 2500, 400);
        Bulldozer bulldozer3 = new Bulldozer("Caterpillar D9", "grey", 3000, 500);
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(bulldozer1);
        bulldozers.add(bulldozer2);
        bulldozers.add(bulldozer3);
        return bulldozers;
    }
}
