package core.mate.academy.producers;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> list = new ArrayList<>();

    public BulldozerProducer() {
        list.add(new Bulldozer("CAT345"));
    }

    public List<Bulldozer> get() {
        return list;
    }
}
