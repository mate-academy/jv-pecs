package core.mate.academy.producer;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> list = new ArrayList<>();
        Excavator excavator1 = new Excavator("Exc-1", 200, "Man-1", "Black");
        list.add(excavator1);
        Excavator excavator2 = new Excavator("Exc-2", 300, "Man-2", "White");
        list.add(excavator2);
        return list;
    }
}
