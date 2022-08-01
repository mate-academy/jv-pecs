package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BuldozerProducer implements MachineProducer<Machine> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        Bulldozer bulldozer = new Bulldozer();
        for (int i = 0; i < 3; i++) {
            bulldozers.add(bulldozer);
        }
        return bulldozers;
    }
}
