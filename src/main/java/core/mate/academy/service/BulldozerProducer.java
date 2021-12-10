package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBulldozer = new Bulldozer();
        firstBulldozer.setName("Volvo");
        firstBulldozer.setColor("yellow");
        firstBulldozer.setBlade("volvoBlade");
        firstBulldozer.setRipper("volvoRipper");

        Bulldozer secondBulldozer = new Bulldozer();
        secondBulldozer.setName("Ford");
        secondBulldozer.setColor("grey");
        secondBulldozer.setBlade("fordBlade");
        secondBulldozer.setRipper("fordRipper");

        Bulldozer thirdBulldozer = new Bulldozer();
        thirdBulldozer.setName("Dodge");
        thirdBulldozer.setColor("green");
        thirdBulldozer.setBlade("dodgeBlade");
        thirdBulldozer.setRipper("dodgeRipper");

        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(firstBulldozer);
        bulldozerList.add(secondBulldozer);
        bulldozerList.add(thirdBulldozer);
        return bulldozerList;
    }
}
