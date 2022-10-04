package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    private final Bulldozer smallBulldozer = new Bulldozer(2, 5);
    private final Bulldozer mediumBulldozer = new Bulldozer(4, 7);
    private final Bulldozer giantBulldozer = new Bulldozer(8, 25);
    private List<Bulldozer> bulldozerList =
            List.of(smallBulldozer, mediumBulldozer, giantBulldozer);

    @Override
    public List<Bulldozer> get() {
        return bulldozerList;
    }
}
