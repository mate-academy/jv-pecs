package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProduser implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.setName("bulldozer1");
        bulldozer1.setColor("blue");
        bulldozer1.setMaxTractionForce(1000);

        Bulldozer bulldozer2 = new Bulldozer();
        bulldozer2.setName("bulldozer2");
        bulldozer2.setColor("green");
        bulldozer2.setMaxTractionForce(1500);

        Bulldozer bulldozer3 = new Bulldozer();
        bulldozer3.setName("bulldozer");
        bulldozer3.setColor("gray");
        bulldozer3.setMaxTractionForce(1300);

        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(bulldozer1);
        bulldozers.add(bulldozer2);
        bulldozers.add(bulldozer3);
        return bulldozers;
    }
}
