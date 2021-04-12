package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer extends Bulldozer implements MachineProducer {

    @Override
    public List<? super Bulldozer> get() {
        List<Bulldozer> bulldozer = new ArrayList<>();
        bulldozer.add(new Bulldozer());
        bulldozer.add(new Bulldozer(10,12));
        return bulldozer;
    }
}
