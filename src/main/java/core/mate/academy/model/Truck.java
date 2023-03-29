package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private static String nameOfMachine;
    private static String country;
    private static int countOfPlace;
    private static int weight;

    public Truck() {
    }

    public static String getNameOfMachine() {
        return nameOfMachine;
    }

    public static void setNameOfMachine(String nameOfMachine) {
        Truck.nameOfMachine = nameOfMachine;
    }

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        Truck.country = country;
    }

    public static int getCountOfPlace() {
        return countOfPlace;
    }

    public static void setCountOfPlace(int countOfPlace) {
        Truck.countOfPlace = countOfPlace;
    }

    public static int getWeight() {
        return weight;
    }

    public static void setWeight(int weight) {
        Truck.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
