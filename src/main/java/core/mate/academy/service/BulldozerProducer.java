package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {

    @Override
    public List<? extends Machine> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        Bulldozer bull = new Bulldozer();
        Bulldozer bulldozer = new Bulldozer();
        bull.setYear(1990);
        bulldozer.setWeight(23);
        bulldozers.add(bull);
        bulldozers.add(bulldozer);
        return bulldozers;
    }
}
