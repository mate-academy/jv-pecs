package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;

import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    Bulldozer firstBulldozer = new Bulldozer(90, 40);
    Bulldozer secondBulldozer = new Bulldozer(80, 50);

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> listOfBulldozers = new ArrayList<>();
        listOfBulldozers.add(firstBulldozer);
        listOfBulldozers.add(secondBulldozer);
        return listOfBulldozers;
    }
}
