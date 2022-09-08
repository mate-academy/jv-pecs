package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;

import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer>{
    @Override
    public List<Bulldozer> get() {
        return List.of(
                new Bulldozer("First", "red", 20),
                new Bulldozer("Second", "blue", 30),
                new Bulldozer("Third", "yellow", 40)
        );
    }
}
