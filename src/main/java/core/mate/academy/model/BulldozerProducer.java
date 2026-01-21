package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;

import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();

        Bulldozer caterpillarD6 = new Bulldozer();
        caterpillarD6.setWidth(3.26);

        Bulldozer komatsuD65PX18 = new Bulldozer();
        komatsuD65PX18.setWidth(4.30);

        Bulldozer liebherrPR736 = new Bulldozer();
        liebherrPR736.setWidth(4.25);

        bulldozers.add(caterpillarD6);
        bulldozers.add(komatsuD65PX18);
        bulldozers.add(liebherrPR736);

        return bulldozers;
    }
}
