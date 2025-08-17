package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;

import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> ExcavatorList = new ArrayList<>();
        ExcavatorList.add(new Excavator("Black" , "Dobra" , "F-16"));
        ExcavatorList.add(new Excavator("Pink" , "Vilka" , "F-2"));
        ExcavatorList.add(new Excavator("Black" , "Raketa" , "B-5"));
        return ExcavatorList;
    }
}
