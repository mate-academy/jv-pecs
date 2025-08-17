package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> excavatorList;

    public ExcavatorProducer() {
        excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator("Minor", "White"));
        excavatorList.add(new Excavator("Fridge", "DarkBlue"));
        excavatorList.add(new Excavator("Bin", "DarkGray"));
    }

    @Override
    public List<Excavator> get() {
        return excavatorList;
    }
}
