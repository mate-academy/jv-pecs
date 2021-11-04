package core.mate.academy.service.producerimpl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    private Bulldozer bulldozer1 = new Bulldozer();
    private Bulldozer bulldozer2 = new Bulldozer();
    private Bulldozer bulldozer3 = new Bulldozer();
    private List<Machine> bulldozers = new ArrayList<>();

    @Override
    public List<Machine> get() {
        bulldozers.add(bulldozer1);
        bulldozers.add(bulldozer2);
        bulldozers.add(bulldozer3);
        return bulldozers;
    }
}
