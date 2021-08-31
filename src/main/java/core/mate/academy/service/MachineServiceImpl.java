package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T>,
        MachineProducer<T> {
    private Random random = new Random();

    @Override
    public List<T> getAll(Class<? extends Machine> type) {
        List<T> list = new ArrayList<>();
        if (type == Bulldozer.class) {
            list = (List<T>) bulldozerProducer();
        }
        if (type == Excavator.class) {
            list = (List<T>) excavatorProducer();

        }
        if (type == Truck.class) {
            list = (List<T>) truckProducer();
        }
        return list;
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine: machines) {
            machine.doWork();
        }

    }

    @Override
    public List<? extends Machine> get() {
        return null;
    }

    @Override
    public List<Bulldozer> bulldozerProducer() {
        List<Bulldozer> list = new ArrayList<Bulldozer>();
        for (int i = 0; i < 3; i++) {
            Bulldozer bulldozer = new Bulldozer();
            bulldozer.setChassis(CHASSIS[random.nextInt(CHASSIS_NUMBER)]);
            bulldozer.setName(NAMES[random.nextInt(NAMES_NUMBER)]);
            bulldozer.setColor(COLORS[random.nextInt(COLORS_NUMBER)]);
            list.add(bulldozer);
        }
        return list;
    }

    @Override
    public List<Excavator> excavatorProducer() {
        List<Excavator> list = new ArrayList<Excavator>();
        for (int i = 0; i < 3; i++) {
            Excavator excavator = new Excavator();
            excavator.setMotorType(MOTORTYPE[random.nextInt(MOTORTYPE_NUMBER)]);
            excavator.setName(NAMES[random.nextInt(NAMES_NUMBER)]);
            excavator.setColor(COLORS[random.nextInt(COLORS_NUMBER)]);
            list.add(excavator);
        }
        return list;
    }

    @Override
    public List<Truck> truckProducer() {
        List<Truck> list = new ArrayList<Truck>();
        for (int i = 0; i < 3; i++) {
            Truck truck = new Truck();
            truck.setLoadCapacity(LOADCAPACITY[random.nextInt(LOADCAPACITY_NUMBER)]);
            truck.setName(NAMES[random.nextInt(NAMES_NUMBER)]);
            truck.setColor(COLORS[random.nextInt(COLORS_NUMBER)]);
            list.add(truck);
        }
        return list;
    }
}
