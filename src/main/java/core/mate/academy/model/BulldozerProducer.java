package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> bulldozersList = new ArrayList<>();

    @Override
    public List<Bulldozer> get() {
        bulldozersList = createBulldozerAndInitializeBulldozersList();
        return bulldozersList;
    }

    private List<Bulldozer> createBulldozerAndInitializeBulldozersList() {
        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.setName("bulldozer_1");
        bulldozer1.setColor("Red");
        bulldozer1.setBladeCapacity(30);
        bulldozer1.setLengthBlade(5);
        bulldozer1.setName("bulldozer_2");
        bulldozer1.setColor("Green");
        Bulldozer bulldozer2 = new Bulldozer();
        bulldozer2.setBladeCapacity(30);
        bulldozer2.setLengthBlade(5);
        bulldozer2.setWeightBlade(20);
        bulldozersList.add(bulldozer1);
        bulldozersList.add(bulldozer2);
        return bulldozersList;
    }
}
