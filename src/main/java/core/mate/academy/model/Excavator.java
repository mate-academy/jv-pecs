package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator<T extends Machine> extends Machine implements MachineProducer<T> {
    private int bucketVolume;
    private int cargoLiftHeight;
    private String drivetrainType;
    private String groundType;

    public Excavator(int bucketVolume, int cargoLiftHeight,
                     String drivetrainType, String groundType) {
        this.bucketVolume = bucketVolume;
        this.cargoLiftHeight = cargoLiftHeight;
        this.drivetrainType = drivetrainType;
        this.groundType = groundType;
    }

    public Excavator() {
    }

    public int getBucketVolume() {
        return bucketVolume;
    }

    public int getCargoLiftHeight() {
        return cargoLiftHeight;
    }

    public String getDrivetrainType() {
        return drivetrainType;
    }

    public String getGroundType() {
        return groundType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public List<T> get() {
        List<T> excavators = new ArrayList<>();
        excavators.add((T) new Excavator<>(500, 10, "tracks", "sand"));
        return excavators;
    }
}
