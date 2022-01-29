package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private final BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private final TruckProducer truckProducer = new TruckProducer();
    private final ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private final Bulldozer bulldozer = new Bulldozer();
    private final Excavator excavator = new Excavator();
    private final Truck truck = new Truck();

    @Override
    public List<Machine> getAll(Class type) {
        List<Machine> machines = new ArrayList<>();
        if (Bulldozer.class.equals(type)) {
            return bulldozerProducer.get();
        } else if (Truck.class.equals(type)) {
            return truckProducer.get();
        } else if (Excavator.class.equals(type)) {
            return excavatorProducer.get();
        }
        return machines;
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Object value) {
        int size = machines.size();
        machines.clear();
        for (int i = 0; i < size; i++) {
            if (Bulldozer.class.equals(value.getClass())) {
                machines.add(bulldozer);
            } else if (Truck.class.equals(value.getClass())) {
                machines.add(truck);
            } else if (Excavator.class.equals(value.getClass())) {
                machines.add(excavator);
            }
        }
    }
}
