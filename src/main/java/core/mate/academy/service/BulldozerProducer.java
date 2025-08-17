package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        list.add(new Bulldozer("CAT 814", "wheeled", "yellow"));
        list.add(new Bulldozer("CAT D1", "tracked", "black"));
        return list;
    }
}
