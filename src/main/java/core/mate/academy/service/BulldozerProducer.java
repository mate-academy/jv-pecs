package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer<E> implements MachineProducer<E> {
    @Override
    public List<? extends Machine> get() {
        Bulldozer firstBulldozer = new Bulldozer();
        firstBulldozer.setColor("red");
        firstBulldozer.setName("Caterpillar");
        firstBulldozer.setBladeType("S blade");

        Bulldozer secondBulldozer = new Bulldozer();
        secondBulldozer.setColor("yellow");
        secondBulldozer.setName("Komatsu");
        secondBulldozer.setBladeType("U blade");

        Bulldozer thirdBulldozer = new Bulldozer();
        thirdBulldozer.setColor("black");
        thirdBulldozer.setName("Shantui");
        thirdBulldozer.setBladeType("S-U blade");

        ArrayList<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(firstBulldozer);
        bulldozers.add(secondBulldozer);
        bulldozers.add(thirdBulldozer);
        return bulldozers;
    }
}
