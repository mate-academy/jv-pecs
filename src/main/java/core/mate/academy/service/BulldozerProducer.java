package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer first = new Bulldozer("volvo", "green", 25, 55);
        Bulldozer second = new Bulldozer("mercedes", "black", 20, 45);
        Bulldozer third = new Bulldozer("renault", "red", 20, 50);
        return List.of(first, second, third);
    }
}
