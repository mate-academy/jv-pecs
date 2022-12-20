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
        testList.add(getExcavator("Red", 101, 290));
        testList.add(getExcavator("Blue", 107, 450));
        testList.add(getExcavator("Yellow", 105, 400));
        return testList;
    }

    private Excavator getExcavator(String color, int weigth, int hrsPower) {
        Excavator vator = new Excavator();
        vator.setColor(color);
        vator.setWeight(weigth);
        vator.setHrsPower(hrsPower);
        return vator;
    }
}
