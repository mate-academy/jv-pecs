package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer("Bulldozer1", "black", "randomValue1",
                "randomValue2", 3);
        Bulldozer bulldozer2 = new Bulldozer("Bulldozer2", "red", "randomValue4",
                "randomValue5", 6);
        Bulldozer bulldozer3 = new Bulldozer("Bulldozer3", "white", "randomValue7",
                "randomValue8", 9);
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(bulldozer1);
        bulldozers.add(bulldozer2);
        bulldozers.add(bulldozer3);
        return bulldozers;
    }
}
