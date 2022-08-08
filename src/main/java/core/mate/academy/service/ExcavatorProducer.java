package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer<T extends Excavator> implements MachineProducer {
    private List<Excavator> listOfExcavator;

    public ExcavatorProducer() {
        listOfExcavator = new ArrayList<>();
        listOfExcavator.add(new Excavator("excavator1", 100));
        listOfExcavator.add(new Excavator("excavator2", 200));
        listOfExcavator.add(new Excavator("excavator3", 300));
    }

    @Override
    public List<Excavator> get() {
        return listOfExcavator;
    }
}
