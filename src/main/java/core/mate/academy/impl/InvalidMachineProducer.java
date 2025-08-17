package core.mate.academy.impl;

import core.mate.academy.model.Machine;
import core.mate.academy.service.MachineProducer;
import java.util.Collections;
import java.util.List;

public class InvalidMachineProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        return Collections.emptyList();
    }
}
