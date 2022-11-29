package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String capacityOfCategory;
    private int tonnage;
    private String typeOfGearbox;

    public Truck() {
    }

    public Truck(String capacityOfCategory, int tonnage, String typeOfGearbox) {
        this.capacityOfCategory = capacityOfCategory;
        this.tonnage = tonnage;
        this.typeOfGearbox = typeOfGearbox;
    }

    public String getCapacityOfCategory() {
        return capacityOfCategory;
    }

    public void setCapacityOfCategory(String capacityOfCategory) {
        this.capacityOfCategory = capacityOfCategory;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public String getTypeOfGearbox() {
        return typeOfGearbox;
    }

    public void setTypeOfGearbox(String typeOfGearbox) {
        this.typeOfGearbox = typeOfGearbox;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
