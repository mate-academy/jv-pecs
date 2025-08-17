package model.producer;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        Bulldozer bulldozerCaterpillar = new Bulldozer("Caterpillar");
        Bulldozer bulldozerKomatsu = new Bulldozer("Komatsu");
        Bulldozer bulldozerCase = new Bulldozer("Case");
        bulldozers.add(bulldozerCaterpillar);
        bulldozers.add(bulldozerKomatsu);
        bulldozers.add(bulldozerCase);
        return bulldozers;
    }
}
