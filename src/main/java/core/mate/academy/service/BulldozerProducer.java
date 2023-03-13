package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozerOld = new Bulldozer();
        Bulldozer bulldozerNew = new Bulldozer();
        bulldozerOld.setWorkTimeHour(600);
        bulldozerNew.setWorkTimeHour(15);
        List<Bulldozer> bulldozerList = List.of(bulldozerOld, bulldozerNew);
        return bulldozerList;
    }
}
