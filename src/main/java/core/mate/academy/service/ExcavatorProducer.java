package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<? super Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Cat", "brown", 3.0));
        excavators.add(new Excavator("Doosan", "orange", 5.0));
        excavators.add(new Excavator("KredMah", "black", 5.5));
        return excavators;
    }
}
