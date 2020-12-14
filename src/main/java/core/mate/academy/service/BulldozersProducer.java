package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozersProducer<T extends Machine> implements MachineProducer<T> {
    private List<? super Machine> bulldozerList;

    public BulldozersProducer() {
        bulldozerList = new ArrayList<>();
        Bulldozer bulldozer1 = new Bulldozer(300, 1000, 80);
        Bulldozer bulldozer2 = new Bulldozer(200, 800, 75);
        Bulldozer bulldozer3 = new Bulldozer(250, 900, 85);
        bulldozerList.add(bulldozer1);
        bulldozerList.add(bulldozer2);
        bulldozerList.add(bulldozer3);
    }

    @Override
    public List<? super Machine> get() {
        return bulldozerList;
    }
}
