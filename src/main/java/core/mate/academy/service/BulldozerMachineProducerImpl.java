package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerMachineProducerImpl implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozerOne = new Bulldozer("FatMan", 1945);
        Bulldozer bulldozerTwo = new Bulldozer("LittleBoy", 1945);
        List<Bulldozer> bulldozerList = new ArrayList<>(2);

        bulldozerList.add(bulldozerOne);
        bulldozerList.add(bulldozerTwo);
        return bulldozerList;
    }
}
