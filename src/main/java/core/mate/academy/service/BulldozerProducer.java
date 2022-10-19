package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozerDaihatsu = new Bulldozer("Daihatsu", "Yellow",
                "Trapezija", 15.6, 3.5);
        Bulldozer bulldozerCat = new Bulldozer("Cat", "Yellow",
                "Universal", 16.7, 3.3);
        Bulldozer bulldozerMitsubishi = new Bulldozer("Mitsubishi", "Green",
                "Very big", 25.8, 5.5);
        return List.of(bulldozerDaihatsu, bulldozerCat, bulldozerMitsubishi);
    }
}
