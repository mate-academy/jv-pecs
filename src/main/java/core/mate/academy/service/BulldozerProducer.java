package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();

        String name1 = "firstBulldozer";
        String color1 = "Yellow";
        Bulldozer firstBulldozer = new Bulldozer(name1, color1);
        bulldozers.add(firstBulldozer);

        String name2 = "secondBulldozer";
        String color2 = "Blue";
        Bulldozer secondBulldozer = new Bulldozer(name2, color2);
        bulldozers.add(secondBulldozer);

        String name3 = "thirdBulldozer";
        String color3 = "PerfectBlue";
        Bulldozer thirdBulldozer = new Bulldozer(name3, color3);
        bulldozers.add(thirdBulldozer);

        return bulldozers;
    }
}
