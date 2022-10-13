package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        final Excavator ex1 = new Excavator();
        ex1.setColor("Pink");
        ex1.setName("Adolf");

        final Excavator ex2 = new Excavator();
        ex1.setColor("Orange");
        ex1.setName("Sebastian");

        final Excavator ex3 = new Excavator();
        ex1.setColor("White");
        ex1.setName("Geralt");

        return List.of(ex1, ex2, ex3);
    }
}
