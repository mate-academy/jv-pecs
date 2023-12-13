package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator();
        excavator1.setBucketLoadCapacity(20);
        excavator1.setWeight(50);
        excavator1.setName("Volvo");
        excavator1.setColor("yellow");

        Excavator excavator2 = new Excavator();
        excavator2.setBucketLoadCapacity(30);
        excavator2.setWeight(60);
        excavator2.setName("Man");
        excavator2.setColor("RED");

        Excavator excavator3 = new Excavator();
        excavator3.setBucketLoadCapacity(25);
        excavator3.setWeight(55);
        excavator3.setName("Komatsu");
        excavator3.setColor("green");

        List<Excavator> excavators = new ArrayList<>();
        excavators.add(excavator1);
        excavators.add(excavator2);
        excavators.add(excavator3);
        return excavators;
    }
}
