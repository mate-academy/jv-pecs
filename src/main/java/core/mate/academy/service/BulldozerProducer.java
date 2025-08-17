package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> machines = new ArrayList<>();
        machines.add(new Bulldozer("Red", "Ford", "Caterpillar"));
        machines.add(new Bulldozer("White", "T-150", "Wheels"));
        machines.add(new Bulldozer("Black", "Lamborgini", "Caterpillar"));
        return machines;
    }
}
