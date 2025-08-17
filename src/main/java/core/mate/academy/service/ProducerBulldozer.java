package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class ProducerBulldozer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozer = new ArrayList<>();
        bulldozer.add(new Bulldozer("I am", "black", 1000, "Super Fast"));
        bulldozer.add(new Bulldozer("I am", "grey", 10, "Super slowliest bulldozer ever =)"));
        bulldozer.add(new Bulldozer("I am", "snowwhite =)", 100000, "catch"));
        return bulldozer;
    }
}
