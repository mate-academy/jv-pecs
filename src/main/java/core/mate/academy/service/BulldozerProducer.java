package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        list.add(createBulldozer("Bulldozer orange", "orange", 2600));
        list.add(createBulldozer("Bulldozer Cat", "yellow", 4200));
        list.add(createBulldozer("Bulldozer white", "white", 3200));
        return list;
    }

    private Bulldozer createBulldozer(String name, String color, int weight) {
        Bulldozer bulldozer = new Bulldozer();
        bulldozer.setName(name);
        bulldozer.setWeight(weight);
        bulldozer.setColor(color);
        return bulldozer;
    }
}
