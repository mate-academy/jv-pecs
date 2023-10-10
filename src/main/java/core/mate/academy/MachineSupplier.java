package core.mate.academy;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Truck;

public class MachineSupplier {
    public static final int DEFAULT_AMOUNT_OF_MACHINE_TO_CREATE = 3;
    private static final String DEFAULT_TRUCK_BODY_TYPE = "Concrete mixer";
    private static final String DEFAULT_TRUCK_CARGO_TYPE = "Concrete";
    private static final double DEFAULT_TRUCK_PAYLOAD = 5.5;
    private static final String DEFAULT_EXCAVATOR_ACTION_PRINCIPLE = "Drag-line";
    private static final String DEFAULT_EXCAVATOR_POWER_EQUIPMENT_TYPE = "Electric";
    private static final String DEFAULT_EXCAVATOR_MOVING_EQUIPMENT_TYPE = "Pneumatic wheels";
    private static final double DEFAULT_BULLDOZER_BLADE_LENGTH = 4500;
    private static final double DEFAULT_BULLDOZER_BLADE_MASS = 15;
    private static final double DEFAULT_BULLDOZER_ROCK_MOVEMENT_DISTANCE = 100;

    public Truck getDefaultTruck() {
        return new Truck(DEFAULT_TRUCK_BODY_TYPE,
                DEFAULT_TRUCK_CARGO_TYPE,
                DEFAULT_TRUCK_PAYLOAD);
    }

    public Bulldozer getDefaultBulldozer() {
        return new Bulldozer(DEFAULT_BULLDOZER_BLADE_LENGTH,
                DEFAULT_BULLDOZER_BLADE_MASS,
                DEFAULT_BULLDOZER_ROCK_MOVEMENT_DISTANCE);
    }

    public Excavator getDefaultExcavator() {
        return new Excavator(DEFAULT_EXCAVATOR_ACTION_PRINCIPLE,
                DEFAULT_EXCAVATOR_POWER_EQUIPMENT_TYPE,
                DEFAULT_EXCAVATOR_MOVING_EQUIPMENT_TYPE);
    }
}
