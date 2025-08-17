package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck volvoA40f = new Truck(1100.25, "A40F", "White");
        Truck terexTa35 = new Truck(1220.35, "TA35", "Green");
        Truck caterpillar740b = new Truck(2010.20, "740B", "Gray");
        return List.of(volvoA40f, terexTa35, caterpillar740b);
    }
}
