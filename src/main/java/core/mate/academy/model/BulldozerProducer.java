package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<Bulldozer>();
        Bulldozer bulldozer1 = new Bulldozer(500);
        bulldozer1.setName("Bulldozer 1");
        bulldozer1.setColor("Yellow");
        bulldozers.add(bulldozer1);
        Bulldozer bulldozer2 = new Bulldozer(600);
        bulldozer2.setName("Bulldozer 2");
        bulldozer2.setColor("Red");
        bulldozers.add(bulldozer2);
        return bulldozers;
    }
}
