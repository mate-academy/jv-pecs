package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;

import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    private List<Machine> machines;

    public BulldozerProducer() {
        machines = new ArrayList<>();
        fillList();
    }

    @Override
    public List<Machine> get() {
        return machines;
    }

    private void fillList() {
        machines.add(new Bulldozer(7, 500));
        machines.add(new Bulldozer(5, 350));
    }
}
