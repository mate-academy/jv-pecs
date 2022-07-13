package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;

import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer<T extends Bulldozer> implements MachineProducer{
    private List<Bulldozer> list = new ArrayList<>();
    @Override
    public List<T> get() {
        Bulldozer wheeledBulldozer = new Bulldozer();
        wheeledBulldozer.setName("CAT 814");
        wheeledBulldozer.setBaseOfBulldozer("wheeled");
        wheeledBulldozer.setColor("yellow");
        list.add(wheeledBulldozer);
        Bulldozer trackedBulldozer = new Bulldozer();
        trackedBulldozer.setName("CAT D1");
        trackedBulldozer.setBaseOfBulldozer("tracked");
        trackedBulldozer.setColor("black");
        list.add(trackedBulldozer);
        return (List<T>) list;
    }
}
