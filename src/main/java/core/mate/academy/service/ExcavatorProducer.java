package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final List<Excavator> excavators;

    public ExcavatorProducer() {
        this.excavators = new ArrayList<>();
    }

    @Override
    public List<Excavator> get() {
        Excavator model1 = new Excavator();
        model1.setName("Excavator 1");
        model1.setColor("red");
        model1.setScoopType("Big scoop");
        model1.setScoopWeight(200);

        Excavator model2 = new Excavator();
        model2.setName("Excavator 2");
        model2.setColor("green");
        model2.setScoopType("Bigger scoop");
        model2.setScoopWeight(300);

        excavators.add(model1);
        excavators.add(model2);

        return excavators;
    }
}
