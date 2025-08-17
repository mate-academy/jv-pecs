package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> listOfBulldozers = new ArrayList<>();
        listOfBulldozers.add(new Bulldozer("Liebherr", "Ripper", "SBlade", true));
        listOfBulldozers.add(new Bulldozer("Caterpillar D11N", "Ripper", "SBlade", true));
        listOfBulldozers.add(new Bulldozer("Zettelmeyer", "Ripper", "UBlade", false));
        return listOfBulldozers;
    }
}
