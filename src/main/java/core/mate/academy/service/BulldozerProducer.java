package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Komatsu D85", "yellow",true, 4.3));
        bulldozers.add(new Bulldozer("CAT D6", "red", false, 3.8));
        return bulldozers;
    }
}
