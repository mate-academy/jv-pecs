package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator("excavatorFirst","blue", 5));
        excavatorList.add(new Excavator("excavatorSecond","black", 6));
        excavatorList.add(new Excavator("excavatorThird","yellow", 7));
        return excavatorList;
    }
}
