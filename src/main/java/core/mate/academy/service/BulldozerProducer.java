package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer();
        Bulldozer bulldozer2 = new Bulldozer();

        bulldozer1.setColor("Yellow");
        bulldozer2.setColor("White");
        bulldozer1.setName("John");
        bulldozer2.setName("Bob");
        bulldozer1.setModel("TR-535");
        bulldozer2.setModel("TR-690");
        bulldozer1.setYear(2009);
        bulldozer2.setYear(2015);

        return List.of(bulldozer1, bulldozer2);
    }
}
