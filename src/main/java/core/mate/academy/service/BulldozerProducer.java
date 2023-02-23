package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<? extends Machine> get() {
        List<Bulldozer> listOfBulldozers = new ArrayList<>();
        for (int i = 0; i < COUNT_OF_MACHINES; i++) {
            listOfBulldozers.add(new Bulldozer());
        }
        return listOfBulldozers;
    }
}
