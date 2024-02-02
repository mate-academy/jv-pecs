package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer(175,451,"Bulldozer1","Yellow"));
        bulldozerList.add(new Bulldozer(145,351,"Bulldozer2","Green"));
        return bulldozerList;
    }
}
