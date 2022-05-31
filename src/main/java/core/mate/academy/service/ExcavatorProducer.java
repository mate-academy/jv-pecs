package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorsList = new ArrayList<>();
        Excavator cat = new Excavator(20, 30, Excavator.ExcavatorType.HYDRAULIC);
        Excavator man = new Excavator(40, 50, Excavator.ExcavatorType.PNEUMATIC);
        Excavator maz = new Excavator(15, 20, Excavator.ExcavatorType.ON_THE_ROPES);
        excavatorsList.add(cat);
        excavatorsList.add(man);
        excavatorsList.add(maz);
        return excavatorsList;
    }
}
