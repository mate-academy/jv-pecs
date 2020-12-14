package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TrucksProducer<T extends Machine> implements MachineProducer<T> {
    private List<? super Machine> tracks;

    public TrucksProducer() {
        tracks = new ArrayList<>();
        Truck truck1 = new Truck("tractor", "ridged", 90);
        Truck truck2 = new Truck("tank", "smooth", 70);
        Truck truck3 = new Truck("crossСountry", "ridged", 110);
        tracks.add(truck1);
        tracks.add(truck2);
        tracks.add(truck3);
    }

    @Override
    public List<? super Machine> get() {
        return tracks;
    }
}
