package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.LinkedList;
import java.util.List;

public interface ExcavatorProducer extends MachineProducer {
    @Override
    default List<Excavator> get() {
        List<Excavator> lsExcavator = new LinkedList<>();
        Excavator excavator1 = new Excavator();
        Excavator excavator2 = new Excavator();
        Excavator excavator3 = new Excavator();
        lsExcavator.add(excavator1);
        lsExcavator.add(excavator2);
        lsExcavator.add(excavator3);

        return lsExcavator;
    }
}
