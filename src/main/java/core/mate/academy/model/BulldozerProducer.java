package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer<T extends Machine> implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        List bulldozerList = new ArrayList<>();
        Bulldozer firstBulldozer = new Bulldozer();
        Bulldozer secondBulldozer = new Bulldozer();
        Bulldozer thirdBulldozer = new Bulldozer();
        bulldozerList.add(firstBulldozer);
        bulldozerList.add(secondBulldozer);
        bulldozerList.add(thirdBulldozer);
        return bulldozerList;
    }
}
