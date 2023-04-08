package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private Bulldozer firstBulldozer = new Bulldozer("First Bulldozer", "white", 2020);
    private Bulldozer secondBulldozer = new Bulldozer("Second Bulldozer", "whie", 2018);
    private Bulldozer thirdBulldizer = new Bulldozer("Third Bulldozer", "red", 2018);

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(firstBulldozer);
        bulldozerList.add(secondBulldozer);
        bulldozerList.add(thirdBulldizer);
        return bulldozerList;
    }
}
