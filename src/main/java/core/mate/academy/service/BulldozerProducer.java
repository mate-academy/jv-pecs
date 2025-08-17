package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    private Bulldozer bull1 = new Bulldozer("concave", "angledozer");
    private Bulldozer bull2 = new Bulldozer("straight", "tiltdozer");
    private Bulldozer bull3 = new Bulldozer("u-shaped", "bulldozer");
    private List<Bulldozer> list = List.of(bull1, bull2, bull3);

    @Override
    public List<Bulldozer> get() {
        return list;
    }
}
