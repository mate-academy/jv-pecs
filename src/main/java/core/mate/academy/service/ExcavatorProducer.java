package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;

import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer{

    @Override
    public List<Machine> get() {
        List<Machine> machines = new ArrayList<>();
        machines.add(new Excavator("Bobcat","white"));
        machines.add(new Excavator("Mahindra","green"));
        machines.add(new Excavator("JCB","yellow"));
        return machines;
    }
}
