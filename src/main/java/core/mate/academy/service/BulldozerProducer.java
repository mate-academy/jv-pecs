package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozerShantui = new Bulldozer();
        Bulldozer bulldozerKomatsu = new Bulldozer();
        Bulldozer bulldozerCaterpillar = new Bulldozer();
        List<Bulldozer> bulldozerList =
                List.of(bulldozerShantui, bulldozerKomatsu, bulldozerCaterpillar);
        return bulldozerList;
    }
}
