package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> listBulldozers;

    public BulldozerProducer() {
        listBulldozers = new ArrayList<>();
        listBulldozers.add(new Bulldozer("ACCO Super Bulldozer", "yellow", 183, 1350));
        listBulldozers.add(new Bulldozer("Komatsu D575A-3 SD", "yellow", 153, 1150));
        listBulldozers.add(new Bulldozer("Caterpillar D11T CD", "yellow", 113, 913));
    }

    @Override
    public List<Bulldozer> get() {
        return listBulldozers;
    }
}
