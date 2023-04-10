package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<? extends Machine> get() {
        return listOfExcavators();
    }
    
    private List<Excavator> listOfExcavators() {
        Excavator excavator1 = new Excavator(1, "big");
        Excavator excavator2 = new Excavator(2, "small");
        Excavator excavator3 = new Excavator(3, "medium");
        excavator1.setName("Vasiliy");
        excavator2.setName("Petr");
        excavator3.setName("Georgiy");
        return List.of(excavator1, excavator2, excavator3);
    }
}
