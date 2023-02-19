package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer abrams = new Bulldozer("Tank", "Yellow", "M1A1",1500);
        Bulldozer leopard = new Bulldozer("Tank", "Grey","2A5",1500);
        List<Bulldozer> bulldozers = new ArrayList<>();
        return List.of(abrams,leopard);
    }
}
