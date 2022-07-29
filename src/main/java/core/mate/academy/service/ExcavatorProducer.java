package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> listExcavators;

    public ExcavatorProducer() {
        listExcavators = new ArrayList<>();
        listExcavators.add(new Excavator("firstExcavator", "gray"));
        listExcavators.add(new Excavator("secondExcavator", "black"));
        listExcavators.add(new Excavator("thirdExcavator", "green"));
    }

    @Override
    public List<Excavator> get() {
        return listExcavators;
    }
}
