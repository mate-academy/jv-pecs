package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = List.of(new Bulldozer("Straight Blades"),
                new Bulldozer("Universal Blade"),
                new Bulldozer("Angle Blade"));
        return bulldozerList;
    }
}
