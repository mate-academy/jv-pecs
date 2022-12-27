package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer(2500, 175, "Komatsu"));
        bulldozers.add(new Bulldozer(1800, 190, "Caterpillar"));
        bulldozers.add(new Bulldozer(2135, 210, "Liebherr"));
        return bulldozers;
    }
}
