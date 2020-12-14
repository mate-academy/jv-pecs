package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> bulldozers = new ArrayList<>();
    private Bulldozer first;
    private Bulldozer second;
    private Bulldozer third;

    @Override
    public List<Bulldozer> get() {
        first = new Bulldozer();
        first.setName("Bulldozer");
        first.setColor("Black");
        first.setTypeOfMovement("Caterpillar");
        first.setNumberOfParkingPlace(12);
        second = new Bulldozer();
        second.setName("Bulldozer");
        second.setColor("Red");
        second.setTypeOfMovement("Caterpillar");
        second.setNumberOfParkingPlace(13);
        third = new Bulldozer();
        first.setName("Bulldozer");
        first.setColor("Blue");
        first.setTypeOfMovement("Caterpillar");
        first.setNumberOfParkingPlace(14);
        bulldozers.add(first);
        bulldozers.add(second);
        bulldozers.add(third);
        return bulldozers;
    }
}
