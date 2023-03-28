package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;

import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer(300, "Heavy");
        Bulldozer bulldozer2 = new Bulldozer(120, "Light");
        Bulldozer bulldozer3 = new Bulldozer(200, "Digging");
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(bulldozer1);
        bulldozers.add(bulldozer2);
        bulldozers.add(bulldozer3);
        return bulldozers;
        }
    }

