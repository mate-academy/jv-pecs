package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer johnDeere = new Bulldozer("John Deere 7930", "Green",
                220,
                7.8,
                390);
        Bulldozer cat = new Bulldozer("cat Chalenget MT865", "Yellow",
                500,
                18597,
                330);
        return List.of(johnDeere, cat);
    }
}
