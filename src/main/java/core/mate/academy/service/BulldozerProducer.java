package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int CURRENT_YEAR = 2023;
    private static final String GREY = "grey";
    private static final String BLACK = "black";

    @Override
    public List<Machine> get() {
        List<Machine> list = new ArrayList<>();
        list.add(new Bulldozer("Man", "yellow", 15000, 2010));
        list.add(new Bulldozer("Man", GREY, 16000, CURRENT_YEAR));
        list.add(new Bulldozer("Toyota", BLACK, 13000, CURRENT_YEAR));
        return list;
    }
}
