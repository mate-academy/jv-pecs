package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final Bulldozer firstBulldozer = new Bulldozer("First Bulldozer", "white", 2030);
    private final Bulldozer secondBulldozer = new Bulldozer("Second Bulldozer", "white", 2027);
    private final Bulldozer thirdBulldozer = new Bulldozer("Third Bulldozer", "red", 2027);

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(firstBulldozer);
        bulldozerList.add(secondBulldozer);
        bulldozerList.add(thirdBulldozer);
        return bulldozerList;
    }
}
