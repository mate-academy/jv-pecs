package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> bulldoserList;

    public BulldozerProducer() {
        bulldoserList = new ArrayList<>();
        bulldoserList.add(new Bulldozer("bulldoser1", "yellow"));
        bulldoserList.add(new Bulldozer("bulldoser2", "red"));
        bulldoserList.add(new Bulldozer("bulldoser3", "black"));
    }

    @Override
    public List<Bulldozer> get() {
        return bulldoserList;
    }
}
