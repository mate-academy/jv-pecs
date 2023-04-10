package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<? extends Machine> get() {
        return listOfBulldozers();
    }

    private List<Bulldozer> listOfBulldozers() {
        Bulldozer bulldozer1 = new Bulldozer("ferry", 2009);
        Bulldozer bulldozer2 = new Bulldozer("terry", 2010);
        Bulldozer bulldozer3 = new Bulldozer("merry", 2011);
        bulldozer1.setColor("grey");
        bulldozer2.setColor("yellow");
        bulldozer3.setColor("green");
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
