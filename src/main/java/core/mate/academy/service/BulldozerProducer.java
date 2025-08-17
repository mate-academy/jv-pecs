package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        Bulldozer cat = new Bulldozer(20, 10, Bulldozer.BulldozerType.WITH_SWIVEL_BLADE);
        Bulldozer man = new Bulldozer(30, 20, Bulldozer.BulldozerType.WITH_NON_SWIVEL_BLADE);
        Bulldozer maz = new Bulldozer(50, 15, Bulldozer.BulldozerType.ROAD_BUILDER);
        bulldozerList.add(cat);
        bulldozerList.add(man);
        bulldozerList.add(maz);
        return bulldozerList;
    }
}
