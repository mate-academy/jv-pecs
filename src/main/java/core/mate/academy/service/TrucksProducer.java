package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TrucksProducer implements MachineProducer<Truck> {
    private List<Truck> tracks;

    public TrucksProducer() {
        tracks = new ArrayList<>();
        Truck truck1 = new Truck("Truk1","orange","tractor", "ridged", 90);
        Truck truck2 = new Truck("Truk2", "blue", "tank", "smooth", 70);
        Truck truck3 = new Truck("Truk3", "black", "crossСountry", "ridged", 110);
        tracks.add(truck1);
        tracks.add(truck2);
        tracks.add(truck3);
    }

    @Override
    public List<Truck> get() {
        return tracks;
    }
}
