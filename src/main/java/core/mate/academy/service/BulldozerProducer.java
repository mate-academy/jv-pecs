package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private Bulldozer smallBulldozer = new Bulldozer();
    private Bulldozer mediumBulldozer = new Bulldozer();
    private Bulldozer bigBulldozer = new Bulldozer();
    private List<Bulldozer> bulldozerList = new ArrayList<>();

    @Override
    public List<Bulldozer> get() {
        bulldozerList.add(smallBulldozer);
        bulldozerList.add(bigBulldozer);
        bulldozerList.add(mediumBulldozer);
        return bulldozerList;
    }
}
