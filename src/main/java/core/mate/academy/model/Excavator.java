package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {

    private String modelExcavator;
    private String usageType;
    private String configuration;

    public Excavator() {

    }

    public Excavator(String modelExcavator, String usageType, String configuration) {
        this.modelExcavator = modelExcavator;
        this.usageType = usageType;
        this.configuration = configuration;
    }

    public void setModelExcavator(String modelExcavator) {
        this.modelExcavator = modelExcavator;
    }

    public String getModelExcavator() {
        return modelExcavator;
    }

    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }

    public String getUsageType() {
        return usageType;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public String getConfiguration() {
        return configuration;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
