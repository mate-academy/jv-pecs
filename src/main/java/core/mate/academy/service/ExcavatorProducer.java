package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator>  {
    @Override
    public List<Excavator> get() {
        List<Excavator> listOfListExcavator = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            listOfListExcavator.add(new Excavator());
        }
        return listOfListExcavator;
    }
}
