package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public interface MachineProducer<T extends Machine> {
    List<T> get();

    class BulldozerProducer implements MachineProducer<Bulldozer> {
        @Override
        public List<Bulldozer> get() {
            List<Bulldozer> bulldozers = new ArrayList<>();
            return bulldozers;
        }
    }

    class TruckProducer implements MachineProducer<Truck> {
        @Override
        public List<Truck> get() {
            List<Truck> trucks = new ArrayList<>();
            return trucks;
        }
    }

    class ExcavatorProducer implements MachineProducer<Excavator> {
        @Override
        public List<Excavator> get() {
            List<Excavator> excavators = new ArrayList<>();
            return excavators;
        }
    }
}
