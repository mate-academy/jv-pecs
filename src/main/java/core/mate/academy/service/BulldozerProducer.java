package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    private List<Bulldozer> bulldozerList = new ArrayList<>();

    public BulldozerProducer() {
        bulldozerList.add(new Bulldozer("firstBulldozer", "yellow"));
        bulldozerList.add(new Bulldozer("secondBulldozer", "pink"));
        bulldozerList.add(new Bulldozer("thirdBulldozer", "white"));
    }

    @Override
    public List<Bulldozer> get() {
        return bulldozerList;
    }
}
