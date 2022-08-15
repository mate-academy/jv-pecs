package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> listOfBulldozer;

    public BulldozerProducer() {
        listOfBulldozer = new ArrayList<>();
        listOfBulldozer.add(new Bulldozer("bulldozer1", 400));
        listOfBulldozer.add(new Bulldozer("bulldozer2", 500));
        listOfBulldozer.add(new Bulldozer("bulldozer3", 600));
    }

    @Override
    public List<Bulldozer> get() {
        return listOfBulldozer;
    }
}
