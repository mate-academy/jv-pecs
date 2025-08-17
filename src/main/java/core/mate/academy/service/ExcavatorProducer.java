package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator(2000,"veryStrong","someModel"));
        excavatorList.add(new Excavator(2020,"4000","otherModel"));
        excavatorList.add(new Excavator(2024,"500","ForHome"));
        return excavatorList;
    }
}
