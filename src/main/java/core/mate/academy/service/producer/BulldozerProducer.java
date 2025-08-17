package core.mate.academy.service.producer;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List get() {
        Bulldozer bulldozerCatD1 = new Bulldozer("D1", "Yellow", "Parallelogram",
                17.6, 13.3);
        Bulldozer bulldozerCatD6 = new Bulldozer("D6", "Yellow", "Semi-Universal (SU)",
                18.9, 14.5);
        Bulldozer bulldozerCatD11 = new Bulldozer("D11 / D11 CD", "Yellow", "Carry Dozer",
                28.4, 20.6);
        return List.of(bulldozerCatD1, bulldozerCatD6, bulldozerCatD11);
    }
}
