package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer("Hitachi", "yellow", "S-Blade"),
                new Bulldozer("Cat", "yellow", "U-Blade"),
                new Bulldozer("Cat D5K2", "yellow", "Power-Angle-Tilt"));
    }
}
