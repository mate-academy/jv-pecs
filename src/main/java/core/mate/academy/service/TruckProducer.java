package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> excavators = new ArrayList<>();

        Truck excavator1 = new Truck();
        excavator1.setName("Truck 1");
        excavator1.setColor("Yellow");
        excavators.add(excavator1);

        Truck excavator2 = new Truck();
        excavator2.setName("Truck 2");
        excavator2.setColor("Red");
        excavators.add(excavator2);

        return excavators;
    }
}
