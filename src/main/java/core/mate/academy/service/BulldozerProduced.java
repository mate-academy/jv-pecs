package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProduced implements MachineProducer {
    private List<Bulldozer> bulldozerList = new ArrayList<>();

    public BulldozerProduced() {
        bulldozerList.add(new Bulldozer(13, 85700));
        bulldozerList.add(new Bulldozer(15, 100000));
        bulldozerList.add(new Bulldozer(17, 200000));
    }

    @Override
    public List get() {
        return bulldozerList;
    }
}
