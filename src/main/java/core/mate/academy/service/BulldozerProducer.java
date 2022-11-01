package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer("BigMonster","Green",100);
        Bulldozer bulldozer2 = new Bulldozer("BiggerMonster","Red",150);
        Bulldozer bulldozer3 = new Bulldozer("TheBiggestMonster","Blue",200);
        return List.of(bulldozer1,bulldozer2,bulldozer3);
    }
}
