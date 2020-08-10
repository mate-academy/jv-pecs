package core.mate.academy.producer;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer(11);
        Bulldozer bulldozer2 = new Bulldozer(22);
        Bulldozer bulldozer3 = new Bulldozer(33);
        List<Bulldozer> bulldozers = List.of(bulldozer1,bulldozer2,bulldozer3);
        return bulldozers;
    }
}
