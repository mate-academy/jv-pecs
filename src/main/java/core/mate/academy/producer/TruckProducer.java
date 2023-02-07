package core.mate.academy.producer;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> produce() {
        Truck man = new Truck();
        man.setType("TGA 18.440");
        man.setWeight(7400);
        man.setEnginePower(340);
        man.setLoadingCapacity(11880);
        man.setName("MAN");
        man.setColor("Black");

        Truck renault = new Truck();
        renault.setType("T430");
        renault.setWeight(7600);
        renault.setEnginePower(323);
        renault.setLoadingCapacity(11330);
        renault.setName("Renault");
        renault.setColor("Blue");

        List<Truck> trucks = new ArrayList<>();
        trucks.add(man);
        trucks.add(renault);
        return trucks;
    }
}
