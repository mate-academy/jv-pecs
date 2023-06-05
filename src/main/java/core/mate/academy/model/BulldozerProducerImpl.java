package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer<Bulldozer> {
    private Bulldozer bulldozer1 = new Bulldozer("Bul1", 10, 20);
    private Bulldozer bulldozer2 = new Bulldozer("Bul2", 30, 40);
    private Bulldozer bulldozer3 = new Bulldozer("Bul3", 50, 60);

    @Override
    public List<Bulldozer> get() {
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
