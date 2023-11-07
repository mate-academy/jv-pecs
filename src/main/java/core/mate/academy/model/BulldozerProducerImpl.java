package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.setName("Bulldozer 1");
        bulldozer1.setColor("Red");
        bulldozer1.setTypeBlade("Blade 1");
        Bulldozer bulldozer2 = new Bulldozer();
        bulldozer2.setName("Bulldozer 2");
        bulldozer2.setColor("Green");
        bulldozer2.setTypeBlade("Blade 2");
        List<Bulldozer> bulldozerList = List.of(bulldozer1,bulldozer2);
        return bulldozerList;
    }
}
