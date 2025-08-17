package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Shantui", 100));
        bulldozers.add(new Bulldozer("John Deere", 200));
        bulldozers.add(new Bulldozer("Komatsu", 300));
        bulldozers.add(new Bulldozer("Caterpillar", 400));
        bulldozers.add(new Bulldozer("LiuGong", 500));
        return bulldozers;
    }
}
