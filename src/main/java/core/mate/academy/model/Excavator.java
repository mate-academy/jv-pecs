package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String excavatorName;
    private String producerName;
    private String model;
    private Integer weight;

    public Excavator() {
    }

    public Excavator(String excavatorName, String producerName, String model, Integer weight) {
        this.excavatorName = excavatorName;
        this.producerName = producerName;
        this.model = model;
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getExcavatorName() {
        return excavatorName;
    }

    public void setExcavatorName(String excavatorName) {
        this.excavatorName = excavatorName;
    }
}
