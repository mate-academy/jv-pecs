package core.mate.academy.service;


import core.mate.academy.model.Excavator;

import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
          List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator("caterpillar","yellow",2001));
        excavatorList.add(new Excavator("Miller","red",2012));
        excavatorList.add(new Excavator("Bondsmen","Black",2010));
        return excavatorList;
    }
}
