package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        ArrayList listOfBulldozer = new ArrayList<>();
        listOfBulldozer.add(new Bulldozer("ripper", 2012));
        listOfBulldozer.add(new Bulldozer("blade", 2020));
        return listOfBulldozer;
    }
}
