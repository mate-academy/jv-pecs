package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBulldozer = new Bulldozer();
        firstBulldozer.setBladeType("U-blade");
        firstBulldozer.setHasRipper(true);
        Bulldozer secondBulldozer = new Bulldozer();
        secondBulldozer.setBladeType("S-blade");
        secondBulldozer.setHasRipper(false);
        Bulldozer thirdBulldozer = new Bulldozer();
        thirdBulldozer.setBladeType("Semi-U");
        thirdBulldozer.setHasRipper(true);
        return List.of(firstBulldozer,secondBulldozer,thirdBulldozer);
    }
}
