package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    private List<Excavator> excavatorList = new ArrayList<>();

    public ExcavatorProducer() {
        excavatorList.add(new Excavator("firstExcavator", "yellow"));
        excavatorList.add(new Excavator("secondExcavator", "pink"));
        excavatorList.add(new Excavator("thirdExcavator", "white"));
    }

    @Override
    public List<Excavator> get() {
        return excavatorList;
    }
}
