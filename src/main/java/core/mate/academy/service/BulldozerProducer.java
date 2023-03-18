package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    private Bulldozer bulldozer1 = new Bulldozer(19.5, 155, "GidroMechanick");
    private Bulldozer bulldozer2 = new Bulldozer(21.7, 133, "GidroStatick");
    private Bulldozer bulldozer3 = new Bulldozer(20.8, 150, "GidroMechanick");

    private List<Bulldozer> bulldozers = List.of(bulldozer1, bulldozer2, bulldozer3);

    public Bulldozer getBulldozer1() {
        return bulldozer1;
    }

    public void setBulldozer1(Bulldozer bulldozer1) {
        this.bulldozer1 = bulldozer1;
    }

    public Bulldozer getBulldozer2() {
        return bulldozer2;
    }

    public void setBulldozer2(Bulldozer bulldozer2) {
        this.bulldozer2 = bulldozer2;
    }

    public Bulldozer getBulldozer3() {
        return bulldozer3;
    }

    public void setBulldozer3(Bulldozer bulldozer3) {
        this.bulldozer3 = bulldozer3;
    }

    public List<Bulldozer> getBulldozers() {
        return bulldozers;
    }

    public void setBulldozers(List<Bulldozer> bulldozers) {
        this.bulldozers = bulldozers;
    }

    @Override
    public List<Bulldozer> get() {
        return bulldozers;
    }
}
