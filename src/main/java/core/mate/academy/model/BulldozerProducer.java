package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> listBulldozer = new ArrayList<>();
        listBulldozer.add(new Bulldozer(2019));
        listBulldozer.add(new Bulldozer(2018));
        listBulldozer.add(new Bulldozer(2020));
        return listBulldozer;
    }
}
