package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("volvo", 2020));
        bulldozers.add(new Bulldozer("man", 1992));
        bulldozers.add(new Bulldozer("scania", 2010));
        return bulldozers;
    }
}
