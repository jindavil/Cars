package shaffel1;

public class Truck extends Cars {
    private int maksWaght;
    private String company;
    private boolean doble;

    Truck(int maksWaght, String company, boolean doble, int wheels, String engine, boolean transmissionAuto) {
        super(wheels, engine, transmissionAuto);
        this.maksWaght = maksWaght;
        this.company = company;
        this.doble = doble;
    }

    @Override
    public String toString() {
        return maksWaght + " " + company + " " + doble + " " + getWheels() + " " + getEngine() + " " + isTransmissionAuto();
    }
}




