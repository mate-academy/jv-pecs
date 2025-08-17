package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer("blue", "XTZ","10", "120"));
        bulldozerList.add(new Bulldozer("black", "Kioto","12", "130"));
        bulldozerList.add(new Bulldozer("white", "Kubota","15", "150"));
        return bulldozerList;
    }
}
