package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer buldozerJack = new Bulldozer();
        buldozerJack.setColor("Violet");
        buldozerJack.setName("Jack");
        buldozerJack.setBladeHeight(10);
        Bulldozer bulldozerJohn = new Bulldozer();
        bulldozerJohn.setColor("Brown");
        bulldozerJohn.setName("John");
        bulldozerJohn.setBladeHeight(16);
        Bulldozer bulldozerMickael = new Bulldozer();
        bulldozerMickael.setColor("Orange");
        bulldozerMickael.setName("Mickael");
        bulldozerMickael.setBladeHeight(22);

        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(buldozerJack);
        bulldozers.add(bulldozerJohn);
        bulldozers.add(bulldozerMickael);
        return bulldozers;
    }
}
