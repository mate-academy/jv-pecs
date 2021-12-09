package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    public static final List<Bulldozer> BULLDOZER_ARRAY_LIST = new ArrayList<>();

    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBulldozer = new Bulldozer();
        firstBulldozer.setName("Volvo");
        firstBulldozer.setColor("yellow");
        firstBulldozer.setBlade("volvoBlade");
        firstBulldozer.setRipper("volvoRipper");
        BULLDOZER_ARRAY_LIST.add(firstBulldozer);
        Bulldozer secondBulldozer = new Bulldozer();
        secondBulldozer.setName("Ford");
        secondBulldozer.setColor("grey");
        secondBulldozer.setBlade("fordBlade");
        secondBulldozer.setRipper("fordRipper");
        BULLDOZER_ARRAY_LIST.add(secondBulldozer);
        Bulldozer thirdBulldozer = new Bulldozer();
        thirdBulldozer.setName("Dodge");
        thirdBulldozer.setColor("green");
        thirdBulldozer.setBlade("dodgeBlade");
        thirdBulldozer.setRipper("dodgeRipper");
        BULLDOZER_ARRAY_LIST.add(thirdBulldozer);
        return BULLDOZER_ARRAY_LIST;
    }
}
