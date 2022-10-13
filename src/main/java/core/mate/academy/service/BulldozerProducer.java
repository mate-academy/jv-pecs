package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    private List<Bulldozer> bulldozerList;

    public BulldozerProducer() {
        this.bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer(300));
        bulldozerList.add(new Bulldozer(400));
        bulldozerList.add(new Bulldozer(500));
    }

    @Override
    public List get() {
        return bulldozerList;
    }
}
