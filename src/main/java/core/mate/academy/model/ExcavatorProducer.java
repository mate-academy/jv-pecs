package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return listOfExcavators();
    }

    private List<Excavator> listOfExcavators() {
        List<Excavator> testList = new ArrayList<>();
        testList.add(getExcavator("Fullsize", 101, 290));
        testList.add(getExcavator("Halfsize", 107, 450));
        testList.add(getExcavator("Compact", 105, 400));
        return testList;
    }

    private Excavator getExcavator(String type, int weigth, int hrsPower) {
        Excavator vator = new Excavator();
        vator.setType(type);
        vator.setWeight(weigth);
        vator.setHrsPower(hrsPower);
        return vator;
    }
}
