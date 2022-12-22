package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;

import javax.crypto.Mac;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> elements = new ArrayList<>();

    @Override
    public List<Excavator> get() {
        createModels();
        return elements;
    }

    private void createModels() {
        elements.add(new Excavator("Excavator1", "Orange"));
        elements.add(new Excavator("Excavator2", "Green"));
        elements.add(new Excavator("Excavator3", "Grey"));
    }
}
