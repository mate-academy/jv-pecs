package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> listOfBulldozers = new ArrayList<>();
        listOfBulldozers.add(new Bulldozer("Sr-01", 2));
        listOfBulldozers.add(new Bulldozer("Sr-03", 3));
        return listOfBulldozers;
    }
}
