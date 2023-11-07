package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        return List.of(
                new Excavator(1, "Mounter E23"),
                new Excavator(2, "Mounter E23"),
                new Excavator(2, "Mounter E23")
        );
    }
}
