package core.mate.academy.suppliers;

import core.mate.academy.enums.MachineType;
import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

public class MachineSupplier {
    private static final MachineType[] MACHINE_TYPES = MachineType.values();
    private NumberSupplier numberSupplier = new NumberSupplier();
    private NameSupplier nameSupplier = new NameSupplier();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Bulldozer getRandomBulldozer() {
        return new Bulldozer(nameSupplier.getBulldozerName(), colorSupplier.getRandomColor(),
                numberSupplier.getRandomIntNumber(Machine.MIN_POWER, Machine.MAX_POWER),
                numberSupplier.getRandomIntNumber(Bulldozer.MIN_BLADE_WIDTH,
                        Bulldozer.MAX_BLADE_WIDTH));
    }

    public Excavator getRandomExcavator() {
        return new Excavator(nameSupplier.getExcavatorName(), colorSupplier.getRandomColor(),
                numberSupplier.getRandomIntNumber(Machine.MIN_POWER, Machine.MAX_POWER),
                numberSupplier.getRandomIntNumber(Excavator.MIN_DIGGING_DEPTH,
                        Excavator.MAX_DIGGING_DEPTH));
    }

    public Truck getRandomTruck() {
        return new Truck(nameSupplier.getTruckName(), colorSupplier.getRandomColor(),
                numberSupplier.getRandomIntNumber(Machine.MIN_POWER, Machine.MAX_POWER),
                numberSupplier.getRandomIntNumber(Truck.MIN_CARGO_CAPACITY,
                        Truck.MAX_CARGO_CAPACITY));
    }

    public Machine getRandomMachine() {
        int index = numberSupplier.getRandomIntNumber(0, MACHINE_TYPES.length);
        MachineType machineType = MACHINE_TYPES[index];
        switch (machineType) {
            case BULLDOZER:
                return new Bulldozer(nameSupplier.getBulldozerName(),
                        colorSupplier.getRandomColor(),
                        numberSupplier.getRandomIntNumber(Machine.MIN_POWER, Machine.MAX_POWER),
                        numberSupplier.getRandomIntNumber(Bulldozer.MIN_BLADE_WIDTH,
                                Bulldozer.MAX_BLADE_WIDTH));
            case EXCAVATOR:
                return new Excavator(nameSupplier.getExcavatorName(),
                        colorSupplier.getRandomColor(),
                        numberSupplier.getRandomIntNumber(Machine.MIN_POWER, Machine.MAX_POWER),
                        numberSupplier.getRandomIntNumber(Excavator.MIN_DIGGING_DEPTH,
                                Excavator.MAX_DIGGING_DEPTH));
            case TRUCK:
                return new Truck(nameSupplier.getTruckName(), colorSupplier.getRandomColor(),
                        numberSupplier.getRandomIntNumber(Machine.MIN_POWER, Machine.MAX_POWER),
                        numberSupplier.getRandomIntNumber(Truck.MIN_CARGO_CAPACITY,
                                Truck.MAX_CARGO_CAPACITY));
            default:
                throw new IllegalArgumentException("No such machine type: " + machineType.name());

        }
    }
}
