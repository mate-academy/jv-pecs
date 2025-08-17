package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.setBucketWidth(4);
        bulldozer1.setHorsePower(500);
        bulldozer1.setName("Volvo");
        bulldozer1.setColor("yellow");

        Bulldozer bulldozer2 = new Bulldozer();
        bulldozer2.setBucketWidth(5);
        bulldozer2.setHorsePower(600);
        bulldozer2.setName("MAN");
        bulldozer2.setColor("green");

        Bulldozer bulldozer3 = new Bulldozer();
        bulldozer3.setBucketWidth(6);
        bulldozer3.setHorsePower(700);
        bulldozer3.setName("Komatsu");
        bulldozer3.setColor("red");

        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(bulldozer1);
        bulldozers.add(bulldozer2);
        bulldozers.add(bulldozer3);
        return bulldozers;
    }
}
