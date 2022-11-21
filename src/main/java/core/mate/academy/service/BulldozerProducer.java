package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> list = new ArrayList<>();

    public List<Bulldozer> get() {
        list.add(new Bulldozer("model1", 1000));
        list.add(new Bulldozer("model2", 1500));
        list.add(new Bulldozer("model3", 2000));
        return list;
    }
}
