package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    public static class BulldozerProducer implements MachineProducer {
        private final List<Bulldozer> bulldozerList = new ArrayList<>();

        @Override
        public List<? extends Machine> get() {
            bulldozerList.add(new Bulldozer());
            bulldozerList.add(new Bulldozer());
            return bulldozerList;
        }
    }

    public static class ExcavatorProducer implements MachineProducer {
        private final List<Excavator> excavatorList = new ArrayList<>();

        @Override
        public List<? extends Machine> get() {
            excavatorList.add(new Excavator());
            excavatorList.add(new Excavator());
            return excavatorList;
        }
    }

    public static class TruckProducer implements MachineProducer {
        private final List<Truck> truckList = new ArrayList<>();

        @Override
        public List<? extends Machine> get() {
            truckList.add(new Truck());
            truckList.add(new Truck());
            return truckList;
        }
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machineArrayList = new ArrayList<>();
        if (type != null && type.equals(Bulldozer.class)) {
            MachineProducer producer = new BulldozerProducer();
            machineArrayList = producer.get();
        }
        if (type != null && type.equals(Excavator.class)) {
            MachineProducer producer = new ExcavatorProducer();
            machineArrayList = producer.get();
        }
        if (type != null && type.equals(Truck.class)) {
            MachineProducer producer = new TruckProducer();
            machineArrayList = producer.get();
        }

        return new ArrayList<>(machineArrayList);
    }

    @Override
    public void fill(List<? super Machine> machines, Object value) {
        int size = machines.size();
        machines.clear();
        for (int i = 0; i < size; i++) {
            machines.add(i, (Machine) value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }

}
