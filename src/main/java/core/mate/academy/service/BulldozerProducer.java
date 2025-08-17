package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> list;

    @Override
    public List<Bulldozer> get() {
        createList();
        return list;
    }

    private void createList() {
        list = new ArrayList<>();
        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.setBulldozerBladeVolume(50);
        bulldozer1.setName("Middle");
        bulldozer1.setColor("red");
        Bulldozer bulldozer2 = new Bulldozer();
        bulldozer2.setBulldozerBladeVolume(70);
        bulldozer2.setName("Big");
        bulldozer2.setColor("orange");
        list.add(bulldozer1);
        list.add(bulldozer2);
    }
}
