package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> list;

    public BulldozerProducer() {
        list = new ArrayList<>();
        Bulldozer firstBulldozer = new Bulldozer();
        Bulldozer secondBulldozer = new Bulldozer();
        Bulldozer thirdBulldozer = new Bulldozer();

        firstBulldozer.setName("first");
        secondBulldozer.setName("second");
        thirdBulldozer.setName("third");

        firstBulldozer.setColor("red");
        secondBulldozer.setColor("blue");
        thirdBulldozer.setColor("green");
        list.add(firstBulldozer);
        list.add(secondBulldozer);
        list.add(thirdBulldozer);
    }

    @Override
    public List<Bulldozer> get() {
        return list;
    }
}
