package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        Bulldozer sem = new Bulldozer("SEM618D", "Junior Sem", "Yellow");
        Bulldozer caterpillar = new Bulldozer("656D_HL","Small Cat", "Orange");
        bulldozers.add(sem);
        bulldozers.add(caterpillar);
        return bulldozers;
    }
}
