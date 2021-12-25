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
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            //return bulldozerProducer.get();
            return new ArrayList<>(bulldozerProducer.get());
        } else if (type == Excavator.class) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            //return excavatorProducer.get();
            return new ArrayList<>(excavatorProducer.get());
        } else if (type == Truck.class) {
            TruckProducer truckProducer = new TruckProducer();
            //return truckProducer.get();
            return new ArrayList<>(truckProducer.get());
        } else {
            ArrayList<Machine> machines = new ArrayList<>();
            return machines;
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        if (value instanceof Bulldozer) {
            int size = machines.size();
            machines.clear();
            for (int k = 0; k < size; k++) {
                machines.add(new Bulldozer());
            }
        } else if (value instanceof Excavator) {
            int size = machines.size();
            machines.clear();
            for (int k = 0; k < size; k++) {
                machines.add(new Excavator());
            }
        } else if (value instanceof Truck) {
            int size = machines.size();
            machines.clear();
            for (int k = 0; k < size; k++) {
                machines.add(new Truck());
            }
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
