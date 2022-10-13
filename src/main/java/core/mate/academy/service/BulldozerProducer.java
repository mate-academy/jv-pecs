package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer(10);
        Bulldozer bulldozer2 = new Bulldozer(20);
        Bulldozer bulldozer3 = new Bulldozer(30);
        List<Bulldozer> bulldozers = List.of(bulldozer1,bulldozer2,bulldozer3);
        return bulldozers;
    }
}
