package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer johnDeere = new Bulldozer("Name : John Deere 7930", "Color : Green",
                220,
                7.8,
                390);
        Bulldozer cat = new Bulldozer("Name :  cat Challenger MT865", "Color : Yellow",
                500,
                18597,
                330);
        return List.of(johnDeere, cat);
    }
}
