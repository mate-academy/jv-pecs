package core.mate.academy.service;

import core.mate.academy.model.Truck;

import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
  private List<Truck> trucksList;

  public TruckProducer() {
    trucksList.add(new Truck("Goose", "white", "Volvo", 30));
    trucksList.add(new Truck("Duck", "black", "Man", 27));
  }

  @Override
  public List<Truck> get() {
    return trucksList;
  }
}
