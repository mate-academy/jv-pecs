package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        return listOfBulldozers();
    }

    private List<Bulldozer> listOfBulldozers() {
        List<Bulldozer> testList = new ArrayList<>();
        testList.add(getBulldozer("Red", 2019, "BEML"));
        testList.add(getBulldozer("Yellow", 2020, "XCMG"));
        testList.add(getBulldozer("Green", 2021, "Zoomlion"));
        return testList;
    }

    private Bulldozer getBulldozer(String color, int year, String name) {
        Bulldozer dozer = new Bulldozer();
        dozer.setColor(color);
        dozer.setYear(year);
        dozer.setName(name);
        return dozer;
    }
}
