package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.producer.BulldozerProducer;
import core.mate.academy.producer.ExcavatorProducer;
import core.mate.academy.producer.TruckProducer;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machines = new ArrayList();
        final String typeSimpleName = type.getSimpleName();
        switch (typeSimpleName) {
            case "Truck":
                TruckProducer truckProducer = new TruckProducer();
                for (Truck truck : truckProducer.get()) {
                    machines.add(truck);
                }
                break;
            case "Bulldozer":
                BulldozerProducer bulldozerProducer = new BulldozerProducer();
                for (Bulldozer bulldozer : bulldozerProducer.get()) {
                    machines.add(bulldozer);
                }
                break;
            case "Excavator":
                ExcavatorProducer excavatorProducer = new ExcavatorProducer();
                for (Excavator excavator : excavatorProducer.get()) {
                    machines.add(excavator);
                }
                break;
            default:
                break;
        }
        return machines;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
