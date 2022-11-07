package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator();
        firstExcavator.setPower(180);
        firstExcavator.setColor("Red");
        firstExcavator.setName("FirstExcavator");
        Excavator secondExcavator = new Excavator();
        secondExcavator.setPower(200);
        secondExcavator.setColor("Yellow");
        secondExcavator.setName("SecondExcavator");
        Excavator thirdExcavator = new Excavator();
        thirdExcavator.setPower(190);
        thirdExcavator.setColor("Blue");
        thirdExcavator.setName("ThirdExcavator");
        return List.of(firstExcavator, secondExcavator, thirdExcavator);
    }
}
