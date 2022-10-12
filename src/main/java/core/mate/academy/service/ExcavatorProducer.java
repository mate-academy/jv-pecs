package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return createStandardList();
    }

    private List<Excavator> createStandardList() {
        List<Excavator> standardList = new ArrayList<>();
        standardList.add(getExcavator("MAN", "Red", 15, 20));
        standardList.add(getExcavator("NAN", "Black", 15, 23));
        standardList.add(getExcavator("PAN", "Yellow", 40, 60));
        return standardList;
    }

    private Excavator getExcavator(String name, String color, int weight, int fuelPerHour) {
        Excavator excavator = new Excavator();
        excavator.setName(name);
        excavator.setColor(color);
        excavator.setWeight(weight);
        excavator.setFuelPerHour(fuelPerHour);
        return excavator;
    }
}
