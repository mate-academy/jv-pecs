package core.mate.academy.producer;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        list.add(new Bulldozer(1.5));
        list.add(new Bulldozer(2.0));
        list.add(new Bulldozer(2.5));
        return list;
    }
}
