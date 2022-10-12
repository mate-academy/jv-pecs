package core.mate.academy.service;

import core.mate.academy.constant.Color;
import core.mate.academy.model.Excavator;
import core.mate.academy.util.RandomValue;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private RandomValue randomValue;
    private List<Excavator> listExcavator;

    public ExcavatorProducer() {
        randomValue = new RandomValue();
        this.listExcavator = new ArrayList<>();
    }

    @Override
    public List<Excavator> get() {
        listExcavator.add(makeDefaultGreenExcavator());
        listExcavator.add(makeDefaultYellowExcavator());
        listExcavator.add(makeDefaultRedExcavator());
        return listExcavator;
    }

    private Excavator makeDefaultGreenExcavator() {
        Excavator greenExcavator = new Excavator();
        greenExcavator.setName(Excavator.class.getName());
        greenExcavator.setColor(Color.GREEN.name());
        greenExcavator.setArmLength(randomValue.getRandomValue());
        greenExcavator.setBoomLength(randomValue.getRandomValue());
        greenExcavator.setTurningRadius(randomValue.getRandomValue());
        return greenExcavator;
    }

    private Excavator makeDefaultYellowExcavator() {
        Excavator yellowExcavator = new Excavator();
        yellowExcavator.setName(Excavator.class.getName());
        yellowExcavator.setColor(Color.YELLOW.name());
        yellowExcavator.setArmLength(randomValue.getRandomValue());
        yellowExcavator.setBoomLength(randomValue.getRandomValue());
        yellowExcavator.setTurningRadius(randomValue.getRandomValue());
        return yellowExcavator;
    }

    private Excavator makeDefaultRedExcavator() {
        Excavator redExcavator = new Excavator();
        redExcavator.setName(Excavator.class.getName());
        redExcavator.setColor(Color.RED.name());
        redExcavator.setArmLength(randomValue.getRandomValue());
        redExcavator.setBoomLength(randomValue.getRandomValue());
        redExcavator.setTurningRadius(randomValue.getRandomValue());
        return redExcavator;
    }
}
