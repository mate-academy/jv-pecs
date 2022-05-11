package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.List;
public class BulldozerProduser<T extends Machine> implements MachineProducer<T> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBulldozer = new Bulldozer("Cat", "Yellow", "C3.6");
        Bulldozer secondBulldozer = new Bulldozer("Cat", "Yellow", "C27");
        Bulldozer thirdBulldozer = new Bulldozer("Cat", "Yellow", "C32");
        return List.of(firstBulldozer, secondBulldozer, thirdBulldozer);
    }
}
