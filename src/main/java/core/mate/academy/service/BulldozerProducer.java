package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer komatsuBulldozer = new Bulldozer("Komatsu","black",10);
        Bulldozer liebherrBulldozer = new Bulldozer("Liebherr","orange",48);
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(komatsuBulldozer);
        bulldozers.add(liebherrBulldozer);
        return bulldozers;
    }
}
