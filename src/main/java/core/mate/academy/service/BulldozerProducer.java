package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> machines = new ArrayList<>();

    @Override
    public List<Bulldozer> get() {
        createModels();
        return machines;
    }

    private void createModels() {
        machines.add(new Bulldozer("Buldozer1", "Yellow"));
        machines.add(new Bulldozer("Buldozer2", "White"));
        machines.add(new Bulldozer("Buldozer3", "Blue"));
    }
}
