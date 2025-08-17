package core.mate.academy.producers;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private Excavator johnDeer = new Excavator();
    private Excavator hitachi = new Excavator();
    private Excavator komatsu = new Excavator();

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(johnDeer);
        excavators.add(hitachi);
        excavators.add(komatsu);
        return excavators;
    }
}
