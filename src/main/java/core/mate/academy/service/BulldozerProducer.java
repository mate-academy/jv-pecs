package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer<T extends Machine> implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> listOfBulldozers = new ArrayList<>();
        listOfBulldozers.add(new Bulldozer(2, 7));
        listOfBulldozers.add(new Bulldozer(3, 15));
        return listOfBulldozers;
    }
}
