package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private Excavator firstExcavator = new Excavator("First Excavator", "black", 2000);
    private Excavator secondExcavator = new Excavator("Second Excavator", "yellow", 2013);
    private Excavator thirdExcavator = new Excavator("Third Excavator", "white", 2017);

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(firstExcavator);
        excavatorList.add(secondExcavator);
        excavatorList.add(thirdExcavator);
        return excavatorList;
    }
}
