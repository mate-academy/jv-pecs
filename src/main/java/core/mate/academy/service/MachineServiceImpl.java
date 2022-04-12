package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            BulldozerProducer listBulldozers = new BulldozerProducer();
            List<? extends Machine> machines = listBulldozers.get();
            return new ArrayList<>(machines);
        }
        if (type == Excavator.class) {
            ExcavatorProducer listExcavators = new ExcavatorProducer();
            List<? extends Machine> machines = listExcavators.get();
            return new ArrayList<>(machines);
        }
        if (type == Truck.class) {
            TruckProducer listTrucks = new TruckProducer();
            List<? extends Machine> machines = listTrucks.get();
            return new ArrayList<>(machines);
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
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
