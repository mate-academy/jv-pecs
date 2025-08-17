package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Caterpilar","Diesel", 7.5));
        excavators.add(new Excavator("Wheeled","Diesel", 4.5));
        return excavators;
    }
}
