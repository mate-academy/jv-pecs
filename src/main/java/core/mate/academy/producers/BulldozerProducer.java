package core.mate.academy.producers;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final Bulldozer bulldozerOne = new Bulldozer(1000, "B135");
    private final Bulldozer bulldozerTwo = new Bulldozer(1200, "B235");
    private final Bulldozer bulldozerThree = new Bulldozer(1400, "B335");

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(bulldozerOne);
        bulldozerList.add(bulldozerTwo);
        bulldozerList.add(bulldozerThree);
        return bulldozerList;
    }
}
