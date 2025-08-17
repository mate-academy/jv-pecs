package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bull1 = new Bulldozer("RX300","red",12,30);
        Bulldozer bull2 = new Bulldozer("RX400","green",10,40);
        Bulldozer bull3 = new Bulldozer("FN200","blue",14,20);
        return List.of(bull1,bull2,bull3);
    }
}
