package core.mate.academy.producer;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer(5, 20, 6));
        bulldozerList.add(new Bulldozer(6, 25, 8));
        bulldozerList.add(new Bulldozer(4, 18, 10));
        return bulldozerList;
    }
}
