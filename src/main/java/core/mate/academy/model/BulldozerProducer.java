package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Machine> list = new ArrayList<>();

    public List<Machine> get() {
        list.add(new Bulldozer("model1", 1000));
        list.add(new Bulldozer("model2", 1500));
        list.add(new Bulldozer("model3", 2000));
        return list;
    }
}
