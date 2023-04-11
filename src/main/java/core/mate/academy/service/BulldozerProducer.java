package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        return listOfBulldozers();
    }

    private List<Bulldozer> listOfBulldozers() {
        Bulldozer bulldozerA = new Bulldozer("ferry", 2009);
        Bulldozer bulldozerB = new Bulldozer("terry", 2010);
        Bulldozer bulldozerC = new Bulldozer("merry", 2011);
        bulldozerA.setColor("grey");
        bulldozerB.setColor("yellow");
        bulldozerC.setColor("green");
        return List.of(bulldozerA, bulldozerB, bulldozerC);
    }
}
