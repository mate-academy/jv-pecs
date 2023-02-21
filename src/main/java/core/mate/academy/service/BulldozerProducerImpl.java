package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducerImpl<M> implements MachineProducer<M> {
    @Override
    public List<M> get() {
        M bulldozer1 = (M) new Bulldozer();
        M bulldozer2 = (M) new Bulldozer();
        M bulldozer3 = (M) new Bulldozer();
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
