package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public interface MachineProducer<T extends Machine> {
    /**
     * In your implementations - create 2-3 models, add them to the list and return
     *
     * @return - the list of models
     */
    class TruckProducer implements MachineProducer<Truck> {

        public List<Truck> get() {
            List<Truck> trucks = new ArrayList<>();

            trucks.add(new Truck(10.5, "стройматериалы", 30.0));
            trucks.add(new Truck(8.0, "жидкости", 25.0));
            trucks.add(new Truck(12.0, "техника", 40.0));
            return trucks;
        }

    }

    class BulldozerProducer implements MachineProducer<Bulldozer> {

        public List<Bulldozer> get() {
            List<Bulldozer> bulldozers = new ArrayList<>();

            bulldozers.add(new Bulldozer(3.5, "гусеницы", 200));
            bulldozers.add(new Bulldozer(4.0, "гусеницы", 250));
            return bulldozers;
        }
    }

    class ExcavatorProducer implements MachineProducer<Excavator> {
        public List<Excavator> get() {
            List<Excavator> excavators = new ArrayList<>();

            excavators.add(new Excavator(1.25, 7,"стандартный"));
            excavators.add(new Excavator(1.5, 8,"загребной"));

            return excavators;
        }
    }
}

