package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> bulldozers = new ArrayList<>();

    @Override
    public List<Bulldozer> get() {
        return fillList(bulldozers);
    }

    private List<Bulldozer> fillList(List<Bulldozer> list) {
        list.add(new Bulldozer("1", "red",true));
        list.add(new Bulldozer("2", "blue",false));
        list.add(new Bulldozer("3", "yellow",true));
        list.add(new Bulldozer("4", "green",false));
        list.add(new Bulldozer("5", "orange",true));
        return list;
    }
}
