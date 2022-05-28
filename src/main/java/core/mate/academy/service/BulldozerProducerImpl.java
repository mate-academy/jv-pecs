package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducerImpl<T extends Machine> implements MachineProducer<Bulldozer> {
    private List<Bulldozer> bulldozerList;

    @Override
    public List<Bulldozer> get() {
        bulldozerList = new ArrayList<>();
        Bulldozer cat = new Bulldozer(20, 10, Bulldozer.BulldozerType.WITH_SWIVEL_BLADE);
        Bulldozer man = new Bulldozer(30, 20, Bulldozer.BulldozerType.WITH_NON_SWIVEL_BLADE);
        Bulldozer maz = new Bulldozer(50, 15, Bulldozer.BulldozerType.ROAD_BUILDER);
        bulldozerList.add(cat);
        bulldozerList.add(man);
        bulldozerList.add(maz);
        return bulldozerList;
    }
}
