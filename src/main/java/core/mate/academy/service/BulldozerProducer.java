package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.setId(1);
        bulldozer1.setModel("T-130");

        Bulldozer bulldozer2 = new Bulldozer();
        bulldozer2.setId(2);
        bulldozer2.setModel("T-75");

        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(bulldozer1);
        bulldozers.add(bulldozer2);
        return bulldozers;
    }
}
