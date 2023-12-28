package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private Bulldozer smallBulldozer = new Bulldozer();
    private Bulldozer mediumBulldozer = new Bulldozer();
    private Bulldozer bigBulldozer = new Bulldozer();
    private List<Bulldozer> bulldozerList = List.of(bigBulldozer, mediumBulldozer, smallBulldozer);

    @Override
    public List<Bulldozer> get() {
        return bulldozerList;
    }
}
