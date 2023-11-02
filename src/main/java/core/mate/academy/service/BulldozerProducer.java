package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        list.add(new Bulldozer("FirstBulldozer", "Black"));
        list.add(new Bulldozer("SecondBulldozer", "White"));
        list.add(new Bulldozer("ThirdBulldozer", "Red"));
        return list;
    }
}
