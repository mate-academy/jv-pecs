package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer = new Bulldozer(2000, "USA");
        bulldozer.setColor("red");
        bulldozer.setName("CAT");
        Bulldozer bulldozer1 = new Bulldozer(2000, "Sweden");
        bulldozer1.setName("Volvo");
        bulldozer1.setColor("black");
        return List.of(bulldozer1, bulldozer);
    }
}
