package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer cat = new Bulldozer("CAT C3.6", 80, 2023, 8099);
        Bulldozer jcb = new Bulldozer("JCB 540-170", 75, 2014, 7240);
        Bulldozer johnDeere = new Bulldozer("JOHN DEERE 1050K", 350, 2022, 43100);
        return List.of(cat, jcb, johnDeere);
    }
}
