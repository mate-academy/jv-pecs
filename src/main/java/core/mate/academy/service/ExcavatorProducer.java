package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator("Hitachi", "black", "car type", "diesel"));
        excavatorList.add(new Excavator("Doosan", "gold", "tractor type", "electric"));
        return excavatorList;
    }
}
