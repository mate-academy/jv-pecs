package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck();
        truck1.setName("Volvo A45G");
        truck1.setColor("Yellow");
        truck1.setMaxWorkingLoad(25);
        truck1.setMaxLoadCapacity(45200);

        Truck truck2 = new Truck();
        truck2.setName("Bell B50E");
        truck2.setColor("Yellow");
        truck2.setMaxWorkingLoad(27);
        truck2.setMaxLoadCapacity(45400);

        return new ArrayList<>(Arrays.asList(truck1, truck2));
    }
}
