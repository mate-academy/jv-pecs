package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer komatsu = Bulldozer.create("Komatsu", "yellow",
                "tracked bulldozer", 6.4, 3);
        Bulldozer zoomlion = Bulldozer.create("Zoomlion", "yellow",
                "tracked bulldozer", 5.8, 4);
        Bulldozer johndeer = Bulldozer.create("John Deere", "green",
                "wheeled bulldozer", 6.2, 6);
        return List.of(komatsu, zoomlion, johndeer);
    }
}
