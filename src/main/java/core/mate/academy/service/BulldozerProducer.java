package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer();
        Bulldozer bulldozer2 = new Bulldozer();
        Bulldozer bulldozer3 = new Bulldozer();
        List<Bulldozer> bulldozerList = List.of(bulldozer1, bulldozer2, bulldozer3);
        return bulldozerList;
    }
}
