package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineProducerImpl implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        return new ArrayList<>();
        }
    }
