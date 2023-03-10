package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {

    @Override
    public List<Machine> get() {
        Bulldozer bulldozerOne = new Bulldozer();
        Bulldozer bulldozerTwo = new Bulldozer();
        Bulldozer bulldozerThree = new Bulldozer();
        return List.of(bulldozerOne, bulldozerTwo, bulldozerThree);
    }
}
