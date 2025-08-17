package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Komatsu",200,21));
        bulldozers.add(new Bulldozer("Fiat",110,22));
        bulldozers.add(new Bulldozer("Caterpillar",850,20));
        return bulldozers;
    }
}
