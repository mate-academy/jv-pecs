package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer modelOne = new Bulldozer();
        Bulldozer modelTwo = new Bulldozer();
        Bulldozer modelTree = new Bulldozer();
        List<Bulldozer> list = List.of(modelOne, modelTwo, modelTree);
        return list;
    }
}
