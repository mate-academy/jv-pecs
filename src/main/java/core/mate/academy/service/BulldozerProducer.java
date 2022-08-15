package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        Bulldozer bulldozer1 = new Bulldozer();
        Bulldozer bulldozer2 = new Bulldozer();
        Bulldozer bulldozer3 = new Bulldozer();
        bulldozerList.add(bulldozer1);
        bulldozerList.add(bulldozer2);
        bulldozerList.add(bulldozer3);
        return bulldozerList;
    }
}
