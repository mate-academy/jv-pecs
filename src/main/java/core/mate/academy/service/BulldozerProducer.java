package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Bulldozer #1", "black", 0, "1st field"));
        bulldozers.add(new Bulldozer("Bulldozer #2", "red", 1, "2nd field"));
        bulldozers.add(new Bulldozer("Bulldozer #3", "yellow", 2, "3rd field"));
        return bulldozers;
    }  
}
