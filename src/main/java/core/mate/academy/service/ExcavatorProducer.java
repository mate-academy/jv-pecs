package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> excavatorMachine = new ArrayList<>();
        excavatorMachine.add(new Excavator("Bucket1", "Arm Actuator1", 100));
        excavatorMachine.add(new Excavator("Bucket2", "Arm Actuator2", 150));
        excavatorMachine.add(new Excavator("Bucket3", "Arm Actuator3", 120));
        return excavatorMachine;
    }
}
