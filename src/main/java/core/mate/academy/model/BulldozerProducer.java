package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer();
        Bulldozer bulldozer2 = new Bulldozer();
        Bulldozer bulldozer3 = new Bulldozer();

        bulldozer1.setName("bulldozer1");
        bulldozer2.setName("bulldozer2");
        bulldozer3.setName("bulldozer3");

        bulldozer1.setColor("Red");
        bulldozer2.setColor("Blue");
        bulldozer3.setColor("Yellow");

        bulldozer1.setShovelSize(2);
        bulldozer2.setShovelSize(3);
        bulldozer3.setShovelSize(4);

        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(bulldozer1);
        bulldozers.add(bulldozer2);
        bulldozers.add(bulldozer3);
        return bulldozers;
    }
}
