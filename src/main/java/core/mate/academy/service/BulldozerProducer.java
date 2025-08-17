package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> listBuldozers;

    public BulldozerProducer() {
        listBuldozers = new ArrayList<>();
        listBuldozers.add(new Bulldozer("firstBulldozer", "gray"));
        listBuldozers.add(new Bulldozer("secondBulldozer", "black"));
        listBuldozers.add(new Bulldozer("thirdBulldozer", "green"));
    }

    @Override
    public List<Bulldozer> get() {
        return listBuldozers;
    }
}
