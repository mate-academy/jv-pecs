package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer blueBulldozer = new Bulldozer();
        Bulldozer yellowBulldozer = new Bulldozer();
        blueBulldozer.setColor("Blue");
        yellowBulldozer.setColor("Yellow");
        blueBulldozer.setName("BobCat");
        yellowBulldozer.setName("Cat");
        return new ArrayList<>(List.of(blueBulldozer, yellowBulldozer));
    }
}
