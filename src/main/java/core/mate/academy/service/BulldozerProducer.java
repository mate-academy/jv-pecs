package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.List;

public class BulldozerProducer extends Bulldozer implements MachineProducer<Machine> {
    private final Machine bulldozer1 = new Bulldozer();
    private final Machine bulldozer2 = new Bulldozer();
    private final List<Machine> buldozers = List.of(bulldozer1, bulldozer2);

    @Override
    public List<Machine> get() {
        return buldozers;
    }
}
