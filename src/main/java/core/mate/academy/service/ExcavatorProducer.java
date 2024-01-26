package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> getModels() {
        ArrayList<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator(50));
        excavators.add(new Excavator(600));
        excavators.add(new Excavator(260));
        return excavators;
    }
}
