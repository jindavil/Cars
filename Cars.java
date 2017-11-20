package shaffel1;

public class Cars {
    private int wheels;
    private String engine;
    private boolean transmissionAuto;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public boolean isTransmissionAuto() {
        return transmissionAuto;
    }

    public void setTransmissionAuto(boolean transmissionAuto) {
        this.transmissionAuto = transmissionAuto;
    }

    public Cars(int wheels, String engine, boolean transmissionAuto) {
        this.wheels = wheels;
        this.engine = engine;
        this.transmissionAuto = transmissionAuto;

    }

    public String toString() {
        return wheels + " " + engine + " " + transmissionAuto;
    }
}

