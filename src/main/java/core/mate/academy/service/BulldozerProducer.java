package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        final List<Machine> bulldozers = new ArrayList<>();

        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.setName("Bulldozer X1");
        bulldozer1.setColor("Yellow");
        bulldozer1.setBladeWidth(3.5);
        bulldozer1.setHorsepower(250);
        bulldozers.add(bulldozer1);

        Bulldozer bulldozer2 = new Bulldozer();
        bulldozer2.setName("Bulldozer X2");
        bulldozer2.setColor("Blue");
        bulldozer2.setBladeWidth(4.0);
        bulldozer2.setHorsepower(300);
        bulldozers.add(bulldozer2);

        return bulldozers;
    }
}
