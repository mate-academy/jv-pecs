package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProduser implements MachineProducer<Bulldozer> {
    private final List<Bulldozer> bulldozersList;

    public BulldozerProduser() {
        bulldozersList = new ArrayList<>();
        bulldozersList.add(new Bulldozer("First","red", 500.0, 1000, 600.0));
        bulldozersList.add(new Bulldozer("Second", "white", 450.0, 900, 550.0));
        bulldozersList.add(new Bulldozer("Third", "blue", 600.0, 1100, 750.0));
    }

    @Override
    public List<Bulldozer> get() {
        return bulldozersList;
    }
}
