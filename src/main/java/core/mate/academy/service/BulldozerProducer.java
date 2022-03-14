package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;

import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer("Jack", "red", 100);
        Bulldozer bulldozer2 = new Bulldozer("Mike", "black", 100);
        Bulldozer bulldozer3 = new Bulldozer("Rob", "white", 100);
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    };
}
