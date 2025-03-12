package ase.ro;

public class Aircraft extends Flight implements Cloneable{
    int weight;
public static int aircraftNo=3;
    public Aircraft(int weight) {
        super();
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public static int getAircraftNo() {
        return aircraftNo;
    }

    @Override
    public void takeOff() {
        System.out.println("Aircraft takeoff ");
    }

    @Override
    public void land() {
        System.out.println("Aircraft land ");
    }

    @Override
    public Aircraft clone() {
            Aircraft clone = new Aircraft(this.weight);
            return clone;

    }
}
