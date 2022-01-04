package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> list;

    public BulldozerProducer() {
        list = new ArrayList<>();
    }

    @Override
    public List<Bulldozer> get() {
        list.add(new Bulldozer("Turning", 300));
        list.add(new Bulldozer("Non-turning", 400));
        return list;
    }
}
