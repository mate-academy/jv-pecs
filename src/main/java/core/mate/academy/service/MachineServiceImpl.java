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

    public class BulldozerProducer implements MachineProducer {
        private List<Bulldozer> bulldozers = new ArrayList<>();
        private Bulldozer bulldozer1 = new Bulldozer();
        private Bulldozer bulldozer2 = new Bulldozer();
        private Bulldozer bulldozer3 = new Bulldozer();

        @Override
        public List<Bulldozer> get() {
            bulldozers.add(bulldozer1);
            bulldozers.add(bulldozer2);
            bulldozers.add(bulldozer3);
            return bulldozers;
        }
    }

    public class ExcavatorProducer implements MachineProducer {
        private List<Excavator> excavators = new ArrayList<>();
        private Excavator excavator1 = new Excavator();
        private Excavator excavator2 = new Excavator();
        private Excavator excavator3 = new Excavator();

        @Override
        public List<Excavator> get() {
            excavators.add(excavator1);
            excavators.add(excavator2);
            excavators.add(excavator3);
            return excavators;
        }
    }

    public class TruckProducer implements MachineProducer {
        private List<Truck> trucks = new ArrayList<>();
        private Truck truck1 = new Truck();
        private Truck truck2 = new Truck();
        private Truck truck3 = new Truck();

        @Override
        public List<Truck> get() {
            trucks.add(truck1);
            trucks.add(truck2);
            trucks.add(truck3);
            return trucks;
        }
    }

    private BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private TruckProducer truckProducer = new TruckProducer();
    private List<? extends Machine> machineArrayList = new ArrayList<>();

    @Override
    public List<Machine> getAll(Class type) {
        if (type == Bulldozer.class) {
            machineArrayList = bulldozerProducer.get();
        } else if (type == Excavator.class) {
            machineArrayList = excavatorProducer.get();
        } else if (type == Truck.class) {
            machineArrayList = truckProducer.get();
        } else {
            machineArrayList = new ArrayList<>();
        }
        return new ArrayList<>(machineArrayList);
    }

    @Override
    public void fill(List<? super Machine> machineList, Machine value) {
        int size = machineList.size();
        for (int i = 0; i < size; i++) {
            machineList.set(i,value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.get(i).doWork();
        }
    }

}
