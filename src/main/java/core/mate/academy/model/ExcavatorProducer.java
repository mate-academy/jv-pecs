package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final LocalDateTime DATE_TIME = LocalDateTime.now();

    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator(1, "BigExcavator", "Stark-excavators-corp.", DATE_TIME));
        excavators.add(new Excavator(2, "BigExcavator", "Stark-excavators-corp.", DATE_TIME));
        excavators.add(new Excavator(3, "BigExcavator", "Stark-excavators-corp.", DATE_TIME));
        return excavators;
    }
}
