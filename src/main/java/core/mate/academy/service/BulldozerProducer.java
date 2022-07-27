package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            bulldozers.add(new Bulldozer("JD108", "black"));
            bulldozers.add(new Bulldozer("JDK208", "brawn"));
        }
        return bulldozers;
    }
}
