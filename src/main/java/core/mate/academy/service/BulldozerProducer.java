package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer modelOne = new Bulldozer(2711, "T154CA");
        Bulldozer modelTwo = new Bulldozer(1891, "T155GA");
        Bulldozer modelTree = new Bulldozer(2500, "T171GA");
        List<Bulldozer> list = List.of(modelOne, modelTwo, modelTree);
        return list;
    }
}
