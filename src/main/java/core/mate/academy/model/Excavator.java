package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String bucket;
    private String boom;

    public Excavator() {
    }

    public Excavator(String bucket, String boom) {
        this.bucket = bucket;
        this.boom = boom;
    }

    public String getBoom() {
        return boom;
    }

    public void setBoom(String boom) {
        this.boom = boom;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
