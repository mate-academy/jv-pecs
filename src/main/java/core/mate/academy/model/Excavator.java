package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String excavatorModel;
    private String scopeOfApplication;

    public Excavator(String excavatorName, String scopeOfApplication) {
        this.excavatorModel = excavatorName;
        this.scopeOfApplication = scopeOfApplication;
    }

    public Excavator() {
    }

    public String getExcavatorName() {
        return excavatorModel;
    }

    public void setExcavatorName(String excavatorName) {
        this.excavatorModel = excavatorName;
    }

    public String getScopeOfApplication() {
        return scopeOfApplication;
    }

    public void setScopeOfApplication(String scopeOfApplication) {
        this.scopeOfApplication = scopeOfApplication;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
