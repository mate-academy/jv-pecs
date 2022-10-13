package core.mate.academy.model;

import core.mate.academy.service.MachineService;
import core.mate.academy.service.MachineServiceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MachineService machineService = new MachineServiceImpl();
        List<Object> machines = new ArrayList<>();
        int randomSize = new Random().nextInt(100);
        for (int i = 0; i < randomSize; i++) {
            machines.add(new Object());
        }
        machineService.fill(machines, new Truck());
        System.out.println(machines.get(0));
    }
}
