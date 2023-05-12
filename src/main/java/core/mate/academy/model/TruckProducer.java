package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck mercedesBenz = new Truck("Mercedes-Benz Actros","White",4,180);
        Truck man = new Truck("man TGX  ","White",4,180);

        return List.of(mercedesBenz,man);
    }
}



