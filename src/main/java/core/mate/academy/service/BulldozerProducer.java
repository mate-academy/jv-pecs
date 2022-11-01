package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer(1,1);
        Bulldozer bulldozer2 = new Bulldozer(2,2);
        Bulldozer bulldozer3 = new Bulldozer(3,3);
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(bulldozer1);
        bulldozerList.add(bulldozer2);
        bulldozerList.add(bulldozer3);
        return bulldozerList;
    }
}
