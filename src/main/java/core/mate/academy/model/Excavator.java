package core.mate.academy.model;

public class Excavator extends Machine {
    private static String chassisType;
    private static String workPrinciple;
    private static String purpose;

    public Excavator() {
    }

    public static String getChassisType() {
        return chassisType;
    }

    public static void setChassisType(String chassisType) {
        Excavator.chassisType = chassisType;
    }

    public static String getWorkPrinciple() {
        return workPrinciple;
    }

    public static void setWorkPrinciple(String workPrinciple) {
        Excavator.workPrinciple = workPrinciple;
    }

    public static String getPurpose() {
        return purpose;
    }

    public static void setPurpose(String purpose) {
        Excavator.purpose = purpose;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
