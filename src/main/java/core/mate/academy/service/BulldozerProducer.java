package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer ferry = new Bulldozer("ferry", 2009);
        Bulldozer terry = new Bulldozer("terry", 2010);
        Bulldozer merry = new Bulldozer("merry", 2011);
        ferry.setColor("grey");
        terry.setColor("yellow");
        merry.setColor("green");
        return List.of(ferry, terry, merry);
    }
}
