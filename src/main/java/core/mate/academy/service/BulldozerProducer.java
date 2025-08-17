package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();

        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.setName("Bulldozer 1");
        bulldozer1.setColor("Yellow");
        bulldozers.add(bulldozer1);

        Bulldozer bulldozer2 = new Bulldozer();
        bulldozer2.setName("Bulldozer 2");
        bulldozer2.setColor("Red");
        bulldozers.add(bulldozer2);

        return bulldozers;
    }
}
