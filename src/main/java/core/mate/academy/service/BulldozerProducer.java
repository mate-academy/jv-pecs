package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer("some ladle type", 199_991);
        Bulldozer bulldozer2 = new Bulldozer("another ladle type", 118_567);
        Bulldozer bulldozer3 = new Bulldozer("big ladle type", 222_565);
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
