package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator(1,"BigExcavator","Stark-corp.", LocalDateTime.now()));
        excavators.add(new Excavator(2,"BigExcavator","Stark-corp.", LocalDateTime.now()));
        excavators.add(new Excavator(3,"BigExcavator","Stark-corp.", LocalDateTime.now()));
        return excavators;
    }
}
