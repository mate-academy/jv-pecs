package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private Bulldozer bulldozerOne = new Bulldozer("John Deere","green");
    private Bulldozer bulldozerSecond = new Bulldozer("CAT", "yellow");
    private Bulldozer bulldozerTree = new Bulldozer("New Holland", "blue");
    private final List<Bulldozer> bulldozers = List.of(
            bulldozerOne, bulldozerSecond, bulldozerTree);

    @Override
    public List<Bulldozer> get() {
        return bulldozers;
    }
}
