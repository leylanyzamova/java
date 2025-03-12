package ase.ro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Aircraft ac1=new Aircraft(7);
        Aircraft h1= new Aircraft(4);

  //      System.out.println(ac1.getWeight());
//        System.out.println(h1.getWeight());
        ac1.printAircraft();
        System.out.println();
        h1.printAircraft();

        System.out.println(Aircraft.getAircraftNo());
        System.out.println();

        h1.takeOff();
        h1.land();

       Aircraft ac2=ac1.clone();
        System.out.println(" ");
    }
}