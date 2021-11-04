package core.mate.academy.strategy;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer = new Bulldozer();
        bulldozer.setColor("green");
        bulldozer.setName("bulldozer");
        List<Bulldozer> list = new ArrayList<>();
        list.add(bulldozer);
        return list;
    }
}
