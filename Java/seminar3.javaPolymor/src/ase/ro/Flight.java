package ase.ro;

public abstract class Flight {

  public Flight(int weight) {

  }

  public Flight() {

  }

  public abstract void takeOff();


  public abstract void land();


  protected int printAircraft() {
      return 0;
  }
}
