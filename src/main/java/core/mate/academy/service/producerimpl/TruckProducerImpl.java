package core.mate.academy.service.producerimpl;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class TruckProducerImpl implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        IntStream.range(1, 10)
                .forEach(i -> trucks.add(new Truck()));
        return trucks;
    }
}
