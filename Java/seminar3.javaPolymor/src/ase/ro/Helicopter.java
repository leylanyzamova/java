package ase.ro;

public class Helicopter extends Flight {
    private int rotorCladesNo;

    public Helicopter(int weight, int rotorCladesNo) {
        super(weight);
        this.rotorCladesNo = rotorCladesNo;
    }
    private int getWeight() {
        return 0;
    }

    public int getRotorCladesNo() {

        return rotorCladesNo;
    }

    public void setRotorCladesNo(int rotorCladesNo) {
        this.rotorCladesNo = rotorCladesNo;
    }

//    @Override
//    public int getWeight() {
//        return super.getWeight();

@Override
    public int printAircraft(){
        return super.printAircraft();
}
    @Override
    public void land() {

    }


    @Override
    public void takeOff() {

    }

    @Override
    public Helicopter clone() {
        Helicopter clone = new Helicopter(this.getWeight(), this.getRotorCladesNo());

        return clone;
    }

}

