package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("MAA","Yellow","Tracks",true));
        excavators.add(new Excavator("CAT","Red","Wheels",true));
        excavators.add(new Excavator());
        return excavators;
    }
}
