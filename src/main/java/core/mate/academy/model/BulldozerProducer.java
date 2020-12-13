package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> listBulldozer = new ArrayList<>();
        listBulldozer.add(new Bulldozer());
        listBulldozer.add(new Bulldozer());
        listBulldozer.add(new Bulldozer());
        return listBulldozer;
    }
}
