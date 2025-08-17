package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozerFirst = new Bulldozer("Destroyer",315,39.5,31.4);
        Bulldozer bulldozerSecond = new Bulldozer("Tiny",200,27.0,25.7);
        Bulldozer bulldozerThird = new Bulldozer("Senya",400,55.3,35.0);

        List<Bulldozer> bulldozers = List.of(bulldozerFirst, bulldozerSecond, bulldozerThird);
        return bulldozers;
    }
}
