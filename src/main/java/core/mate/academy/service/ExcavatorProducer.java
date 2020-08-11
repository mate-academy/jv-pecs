package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator excavatorOne = new Excavator("electrical",
                "career", "pneumatic");
        Excavator excavatorTwo = new Excavator("diesel",
                "mine", "crawler");
        Excavator excavatorThird = new Excavator("diesel",
                "building", "Walking");
        return Arrays.asList(excavatorOne, excavatorTwo, excavatorThird);
    }
}
