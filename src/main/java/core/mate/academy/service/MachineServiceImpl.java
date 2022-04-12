package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private BulldozerProducer listBulldozers = new BulldozerProducer();
    private ExcavatorProducer listExcavators = new ExcavatorProducer();
    private TruckProducer listTrucks = new TruckProducer();

    @Override
    public List<Machine> getAll(Class type) {
        if (type == Bulldozer.class) {
            List<? extends Machine> machines = listBulldozers.get();
            return new ArrayList<>(machines);
        }
        if (type == Excavator.class) {
            List<? extends Machine> machines = listExcavators.get();
            return new ArrayList<>(machines);
        }
        if (type == Truck.class) {
            List<? extends Machine> machines = listTrucks.get();
            return new ArrayList<>(machines);
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public void fill(List<Object> machines, Object value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (int i = 0; i < machines.size(); i++) {
            machines.get(i).doWork();
        }
    }
}
