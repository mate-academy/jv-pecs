package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("CAT D8T", 2015, 4));
        bulldozers.add(new Bulldozer("Komatsu D85", 2018, 4));
        bulldozers.add(new Bulldozer("John Deere 850K", 2020, 7));
        return bulldozers;
    }
}
