package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class UnknownProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        return new ArrayList<>();
    }
}
