package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.setName("Komatsu D61PXI-23 ");
        bulldozer1.setColor("Yellow");
        bulldozer1.setWeight(41700);
        bulldozer1.setBladeType("6 way blade");

        Bulldozer bulldozer2 = new Bulldozer();
        bulldozer2.setName("Caterpillar D9R");
        bulldozer2.setColor("Yellow");
        bulldozer2.setWeight(9530);
        bulldozer2.setBladeType("Semi u-blade");

        return new ArrayList<>(Arrays.asList(bulldozer1, bulldozer2));
    }
}
