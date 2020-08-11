package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerFactory implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        list.add(new Bulldozer("FA856", 1987, 10568));
        list.add(new Bulldozer("GS548", 2010, 50545));
        list.add(new Bulldozer("FT698", 2019, 900));
        return list;
    }
}
