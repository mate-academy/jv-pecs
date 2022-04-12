package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    private Bulldozer model = new Bulldozer();

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> listBulldozer = new ArrayList<>();
        listBulldozer.add(model);
        return listBulldozer;
    }
}
