package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Machine> get() {
        Excavator belaz = new Excavator("Belarus", "Yellow", 420, "HardWorkingType");
        Excavator union7 = new Excavator("Un7", "Blue", 270, "MediumWorkingType");
        Excavator zarya = new Excavator("Zarya", "White&Blue", 670, "ExtremelyHardType");
        return List.of(belaz, union7, zarya);
    }
}
