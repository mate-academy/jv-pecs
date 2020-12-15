package core.mate.academy.service;

import core.mate.academy.model.Chassis;
import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        list.add(new Excavator(Chassis.CRAWLER));
        list.add(new Excavator(Chassis.WHEELED));
        list.add(new Excavator(Chassis.WHEELED));
        return list;
    }
}
