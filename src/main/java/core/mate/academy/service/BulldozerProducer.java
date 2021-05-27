package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    @Override
    public List<? super Machine> get() {
        List<? super Machine> bulldozers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            bulldozers.add(new Bulldozer());
        }
        return bulldozers;
    }
}
