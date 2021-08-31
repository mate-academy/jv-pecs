package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.List;

public interface MachineProducer<T extends Machine> {
    /**
     * In your implementations - create 2-3 models, add them to the list and return
     * @return - the list of models
     */
    static final int COLORS_NUMBER = 7;
    static final String[] COLORS = new String[]{"red", "blue", "black",
            "orange", "grey", "green", "yellow"};
    static final int NAMES_NUMBER = 7;
    static final String[] NAMES = new String[]{"Volvo", "Freightliner", "Peterbilt",
            "JCB", "KOMATSU", "HITACHI", "CAT"};
    static final int CHASSIS_NUMBER = 2;
    static final String[] CHASSIS = new String[]{"crawler", "wheeled"};
    static final int MOTORTYPE_NUMBER = 2;
    static final String[] MOTORTYPE = new String[]{"diesel", "electric"};
    static final int LOADCAPACITY_NUMBER = 3;
    static final int[] LOADCAPACITY = new int[]{5, 10, 20};

    public List<? extends Machine> get();

    public List<Bulldozer> BulldozerProducer();

    public List<Excavator> ExcavatorProducer();

    public List<Truck> TruckProducer();
}
