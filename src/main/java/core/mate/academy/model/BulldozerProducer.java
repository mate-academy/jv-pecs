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
        list.add(new Bulldozer("Komatsu",200,3000));
        list.add(new Bulldozer("Liebherr",250,1850));
        list.add(new Bulldozer("Katerpillar",300,3200));
        return list;
    }
}
