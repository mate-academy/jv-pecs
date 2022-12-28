package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    private Bulldozer firstBulldozer = new Bulldozer();
    private Bulldozer secondBulldozer = new Bulldozer();
    private Bulldozer thirdBulldozer = new Bulldozer();

    @Override
    public List<Machine> get() {
        List<Machine> list = new ArrayList<>();
        list.add(firstBulldozer);
        list.add(secondBulldozer);
        list.add(thirdBulldozer);
        return list;
    }
}
