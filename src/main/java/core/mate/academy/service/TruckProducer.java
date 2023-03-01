package core.mate.academy.service;

import core.mate.academy.model.Truck;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TruckProducer implements MachineProducer<Truck> {
  private static final int COUTN = 6;

  @Override
  public List<Truck> get() {
    return IntStream.range(0, COUTN).mapToObj(i -> new Truck()).collect(Collectors.toList());
  }
}
