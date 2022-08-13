package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer = new Bulldozer(false, 100);
        Bulldozer bulldozer1 = new Bulldozer(true, 200);
        Bulldozer bulldozer3 = new Bulldozer(true, 0);
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(bulldozer);
        bulldozers.add(bulldozer1);
        bulldozers.add(bulldozer3);
        return bulldozers;
    }
}
