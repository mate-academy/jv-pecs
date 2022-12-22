package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;

import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> elements = new ArrayList<>();

    @Override
    public List<Bulldozer> get() {
        createModels();
        return elements;
    }

    private void createModels() {
        elements.add(new Bulldozer("Buldozer1", "Yellow"));
        elements.add(new Bulldozer("Buldozer2", "White"));
        elements.add(new Bulldozer("Buldozer3", "Blue"));
    }
}
