package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozerOne = new Bulldozer(false, 100);
        Bulldozer bulldozerTwo = new Bulldozer(true, 200);
        Bulldozer bulldozerThree = new Bulldozer(true, 0);
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(bulldozerOne);
        bulldozers.add(bulldozerTwo);
        bulldozers.add(bulldozerThree);
        return bulldozers;
    }
}
