package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> listOfBulldozers = new ArrayList<>();
        for (int i = 0; i < COUNT_OF_MACHINES; i++) {
            listOfBulldozers.add(new Bulldozer());
        }
        return listOfBulldozers;
    }
}
