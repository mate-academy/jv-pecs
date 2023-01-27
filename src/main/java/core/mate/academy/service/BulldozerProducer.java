package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer modelOne = new Bulldozer();
        Bulldozer modelTwo = new Bulldozer();
        Bulldozer modelThree = new Bulldozer();
        List<Bulldozer> listOfModels = List.of(modelOne, modelTwo, modelThree);
        return listOfModels;
    }
}
