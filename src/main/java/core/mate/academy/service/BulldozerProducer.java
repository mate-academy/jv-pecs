package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozer = new ArrayList<>();
        bulldozer.add(new Bulldozer("caterpillar", "yellow", 10, 10, "crawler"));
        bulldozer.add(new Bulldozer("johnDeere", "green", 5, 5, "mini"));
        bulldozer.add(new Bulldozer("case", "red", 15, 15, "hybrid"));
        return bulldozer;
    }
}
