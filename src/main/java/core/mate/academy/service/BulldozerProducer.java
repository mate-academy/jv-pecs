package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return createStandardList();
    }

    private List<Bulldozer> createStandardList() {
        List<Bulldozer> standardList = new ArrayList<>();
        standardList.add(getBulldozer("MAN", "Red", 20, 2000));
        standardList.add(getBulldozer("LAN", "Black", 25, 2300));
        standardList.add(getBulldozer("SAN", "Yellow", 40, 6000));
        return standardList;
    }

    private Bulldozer getBulldozer(String name, String color, int weight, int power) {
        Bulldozer bulldozer = new Bulldozer();
        bulldozer.setName(name);
        bulldozer.setColor(color);
        bulldozer.setWeight(weight);
        bulldozer.setPower(power);
        return bulldozer;
    }
}
