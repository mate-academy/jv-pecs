package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> listBulldozer = new ArrayList<>();
        listBulldozer.add(new Bulldozer("bul1", "red", 100));
        listBulldozer.add(new Bulldozer("bul2", "green", 150));
        return listBulldozer;
    }
}
