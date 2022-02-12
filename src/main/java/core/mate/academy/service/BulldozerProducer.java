package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        Bulldozer bulldozer = new Bulldozer();
        Bulldozer bulldozer1 = new Bulldozer();
        Bulldozer bulldozer2 = new Bulldozer();
        bulldozers.add(bulldozer);
        bulldozers.add(bulldozer1);
        bulldozers.add(bulldozer2);
        return bulldozers;
    }
}
