package core.mate.academy.producer.implementations;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> bulldozers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            bulldozers.add(new Bulldozer());
        }
        return bulldozers;
    }
}
