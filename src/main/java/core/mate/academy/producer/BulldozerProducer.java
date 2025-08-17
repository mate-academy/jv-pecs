package core.mate.academy.producer;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> list = new ArrayList<>();
        Bulldozer bulldozer1 = new Bulldozer("Bull-1", "Type-1", "Model-1", "Black");
        list.add(bulldozer1);
        Bulldozer bulldozer2 = new Bulldozer("Bull-2", "Type-2", "Model-2", "White");
        list.add(bulldozer2);
        return list;
    }
}
