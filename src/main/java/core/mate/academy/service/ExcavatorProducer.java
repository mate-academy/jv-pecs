package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    public static final String FIRST_COLOR = "White";
    public static final String SECOND_COLOR = "Yellow";
    public static final String THIRD_COLOR = "Red";
    public static final String FIRST_NAME = "Caterpillar";
    public static final String SECOND_NAME = "Liebherr";
    public static final String THIRD_NAME = "Komatsu";
    private List<Excavator> excavatorList;

    public ExcavatorProducer() {
        excavatorList = new ArrayList<>();
        excavatorList.add(produceExcavator(FIRST_COLOR, FIRST_NAME));
        excavatorList.add(produceExcavator(SECOND_COLOR, SECOND_NAME));
        excavatorList.add(produceExcavator(THIRD_COLOR, THIRD_NAME));
    }

    @Override
    public List<Excavator> get() {
        return excavatorList;
    }

    private Excavator produceExcavator(String color, String name) {
        Excavator excavator = new Excavator();
        excavator.setColor(color);
        excavator.setName(name);
        return excavator;
    }
}
