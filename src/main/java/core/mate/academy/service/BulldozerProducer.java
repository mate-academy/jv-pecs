package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    private Bulldozer bulldozer1 = new Bulldozer(false, true, "CatLGP", "Yellow");
    private Bulldozer bulldozer2 = new Bulldozer(false, false, "LiebherrPR734", "Green");
    private Bulldozer bulldozer3 = new Bulldozer(true, true, "CatC15", "Red");

    @Override
    public List<Bulldozer> get() {
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
