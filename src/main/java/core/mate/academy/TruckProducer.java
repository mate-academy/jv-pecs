package core.mate.academy;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    private List<Truck> list = new ArrayList<>();
    private Truck firstTruck = new Truck();
    private Truck secondTruck = new Truck();
    private Truck thirdTruck = new Truck();

    {
        list.add(firstTruck);
        list.add(secondTruck);
        list.add(thirdTruck);
    }

    @Override
    public List<Truck> get() {
        return list;
    }
}
