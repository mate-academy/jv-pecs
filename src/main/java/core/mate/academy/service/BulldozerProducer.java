package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.setName("Nadiya");
        bulldozer1.setColor("blue");
        bulldozer1.setCaterpillarModel("T3000");
        bulldozer1.setBucketWidth(475);

        Bulldozer bulldozer2 = new Bulldozer();
        bulldozer2.setName("Vira");
        bulldozer2.setColor("yellow");
        bulldozer2.setCaterpillarModel("T4001");
        bulldozer2.setBucketWidth(575);

        return new ArrayList<>(Arrays.asList(bulldozer1, bulldozer2));
    }
}
