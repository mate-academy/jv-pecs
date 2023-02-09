package core.mate.academy.producer;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck mercedes = new Truck();
        mercedes.setName("Mercedes");
        mercedes.setColor("Blue");
        mercedes.setCargoType("Dry Van Trailer");
        mercedes.setMaxLoad(2000);
        Truck iveco = new Truck();
        iveco.setName("Iveco");
        iveco.setColor("White");
        iveco.setCargoType("Liquid tanker");
        iveco.setMaxLoad(3000);
        List<Truck> truckList = new ArrayList<>();
        truckList.add(mercedes);
        truckList.add(iveco);
        return truckList;
    }
}
