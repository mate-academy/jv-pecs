package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return bulldozerList;
    }

    private Bulldozer smallBulldozer = new Bulldozer(2, 5);
    private Bulldozer mediumBulldozer = new Bulldozer(4, 7);
    private Bulldozer giantBulldozer = new Bulldozer(8, 25);

    List<Bulldozer> bulldozerList = List.of(smallBulldozer, mediumBulldozer, giantBulldozer);







}
