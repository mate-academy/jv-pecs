package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer = new Bulldozer();
        bulldozer.setYear(2011);
        bulldozer.setName("Cor");
        bulldozer.setColor("Blue");

        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.setYear(2020);
        bulldozer1.setColor("White");
        bulldozer1.setName("Bull");

        return List.of(bulldozer,bulldozer1);
    }
}
