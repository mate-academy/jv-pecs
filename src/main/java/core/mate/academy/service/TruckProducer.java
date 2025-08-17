package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck modelOne = new Truck("LOVOL FT 504", 735000);
        Truck modelTwo = new Truck("YTO NLX1054", 956868);
        Truck modelTree = new Truck("Dongfeng DF 244 DH", 299999);
        List<Truck> list = List.of(modelOne, modelTwo, modelTree);
        return list;
    }
}
