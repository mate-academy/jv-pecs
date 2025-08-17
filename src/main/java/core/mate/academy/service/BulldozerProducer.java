package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Buldozavr", " black", "Full-paver"));
        bulldozers.add(new Bulldozer("Buldog", " red", "Middle-paver"));
        bulldozers.add(new Bulldozer("Kek", " black", "paverLess"));
        return bulldozers;
    }
}
