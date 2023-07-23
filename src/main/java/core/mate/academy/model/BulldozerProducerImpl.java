package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.setName("B1");
        bulldozer1.setColor("R1");
        Bulldozer bulldozer2 = new Bulldozer();
        bulldozer2.setName("B2");
        bulldozer2.setColor("G2");
        List<Bulldozer> bulldozerList = List.of(bulldozer1,bulldozer2);
        return bulldozerList;
    }
}
