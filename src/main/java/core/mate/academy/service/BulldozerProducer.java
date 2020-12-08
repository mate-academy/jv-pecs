package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;

import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer{
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        list.add(new Bulldozer("Grand", "black", 500));
        list.add(new Bulldozer("Fargo", "white", 480));
        list.add(new Bulldozer("Dank", "yellow", 550));
        return null;
    }
}
