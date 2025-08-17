package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> bulldozers;

    @Override
    public List<Bulldozer> get() {
        this.bulldozers = new ArrayList<>();

        Bulldozer model1 = new Bulldozer();
        model1.setName("Bulldozer 1");
        model1.setColor("red");
        model1.setDumpType("Big dump");
        model1.setDumpWeight(200);

        Bulldozer model2 = new Bulldozer();
        model2.setName("Bulldozer 2");
        model2.setColor("green");
        model2.setDumpType("Bigger dump");
        model2.setDumpWeight(300);

        bulldozers.add(model1);
        bulldozers.add(model2);

        return bulldozers;
    }
}
