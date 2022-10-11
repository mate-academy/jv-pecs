package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> bulldozers = new ArrayList<>();

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer("First", "blue", "typeOfBlade", 10);
        Bulldozer bulldozer2 = new Bulldozer("Second", "orange", "typeOfBlade2", 13);
        bulldozers.add(bulldozer1);
        bulldozers.add(bulldozer2);
        return bulldozers;
    }
}
