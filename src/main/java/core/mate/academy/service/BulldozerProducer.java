package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;

import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Tractor", "Sem", "Sem"));
        bulldozers.add(new Bulldozer("Dump truck", "Cat", "Cat"));
        return bulldozers;
    }
}
