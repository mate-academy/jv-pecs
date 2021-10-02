package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private Bulldozer johnDeereDozer = new Bulldozer("John Deere Dozer", "yellow", 100);
    private Bulldozer komatsuDozer = new Bulldozer("Komatsu Dozer", "red", 150);
    private Bulldozer caterpillarDozer = new Bulldozer("Caterpillar Dozer", "orange", 160);

    @Override
    public List<Bulldozer> get() {
        return List.of(johnDeereDozer, komatsuDozer, caterpillarDozer);
    }
}
