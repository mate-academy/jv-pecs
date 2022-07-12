package core.mate.academy.service;

import core.mate.academy.model.Machine;

import java.util.List;

public class ExcavatorProducer<T extends Machine> implements MachineProducer{
    @Override
    public List<T> get() {
        return null;
    }
}
