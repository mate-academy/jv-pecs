package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> newList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Bulldozer newBulldozer = new Bulldozer();
            newBulldozer.setBladeHeight(10);
            newBulldozer.setRippingDepth(5);
            newBulldozer.setColor("yellow");
            newBulldozer.setName("Super Bulldozer");
            newList.add(newBulldozer);
        }
        return newList;
    }
}
