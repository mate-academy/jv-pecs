package core.mate.academy.service.producer;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        return List.of(new Truck(363, 64, "dump truck",
                        "Liebherr T284", "Red"),
                        new Truck(50, 91, "heavy duty truck",
                        "MAZ-642205", "White"),
                        new Truck(40, 103, "concrete mixer truck",
                        "Euromix truck mixer 10 M³", "Green"));
    }
}
