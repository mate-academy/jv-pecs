package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    private Excavator createExcavatorModel1() {
        Excavator excavator1 = new Excavator();
        excavator1.setName("WHT75");
        excavator1.setColor("BLACK");
        excavator1.setOwner("LTD STAR");
        return excavator1;
    }

    private Excavator createExcavatorModel2() {
        Excavator excavator2 = new Excavator();
        excavator2.setName("PRH24");
        excavator2.setColor("GREEN");
        excavator2.setOwner("LTD BIG");
        return excavator2;
    }

    @Override
    public List<Machine> get() {
        List<Machine> excavatorList = new ArrayList<>();
        excavatorList.add(createExcavatorModel1());
        excavatorList.add(createExcavatorModel2());
        return excavatorList;
    }
}
