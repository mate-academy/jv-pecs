package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer blueBulldozer = new Bulldozer("BobCat", "Blue");
        Bulldozer yellowBulldozer = new Bulldozer("Cat", "Yellow");
        return List.of(blueBulldozer, yellowBulldozer);
    }
}
