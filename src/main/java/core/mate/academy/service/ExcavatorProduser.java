package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.List;

public class ExcavatorProduser<T extends Machine> implements MachineProducer<T> {
    @Override
    public List<? extends Machine> get() {
        Excavator firstExcavator = new Excavator("John Deere", "White", "75G");
        Excavator secondExcavator = new Excavator("John Deere", "Green", "85G");
        Excavator thirdExcavator = new Excavator("John Deere", "Purpule", "130G");

        return List.of(firstExcavator, secondExcavator, thirdExcavator);
    }
}
