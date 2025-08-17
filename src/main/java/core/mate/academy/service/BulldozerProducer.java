package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer("Shaulin", "RED",
                85.1, 15.4);
        Bulldozer bulldozer2 = new Bulldozer("Herbatiy", "BLUE",
                123.4, 18.3);
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(bulldozer1);
        bulldozers.add(bulldozer2);
        return bulldozers;
    }
}
