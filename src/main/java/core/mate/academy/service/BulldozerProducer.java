package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer = new Bulldozer();
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(bulldozer);
        return bulldozers;
    }
}
