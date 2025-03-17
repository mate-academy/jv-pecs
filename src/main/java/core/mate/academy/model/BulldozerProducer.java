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

        bulldozer1.setName("BullDozer1");
        bulldozer2.setName("BullDozer2");
        bulldozer3.setName("BullDozer3");

        bulldozer1.setColor("Black");
        bulldozer2.setColor("Yellow");
        bulldozer3.setColor("White");

        bulldozer1.setWeight(150);
        bulldozer2.setWeight(200);
        bulldozer3.setWeight(175);

        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(bulldozer1);
        bulldozers.add(bulldozer2);
        bulldozers.add(bulldozer3);
        return bulldozers;
    }
}
