package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        Excavator excavatorBrown = new Excavator();
        excavatorBrown.setColor("White");
        excavatorBrown.setName("Brown");
        excavatorBrown.setBucketVolume(25);
        Excavator excavatorBobby = new Excavator();
        excavatorBobby.setColor("Black");
        excavatorBobby.setName("Bobby");
        excavatorBobby.setBucketVolume(25);
        Excavator excavatorJack = new Excavator();
        excavatorJack.setColor("Red");
        excavatorJack.setName("Jack");
        excavatorJack.setBucketVolume(25);

        List<Excavator> excavators = new ArrayList<>();
        excavators.add(excavatorBrown);
        excavators.add(excavatorBobby);
        excavators.add(excavatorJack);
        return excavators;
    }
}
