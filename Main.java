
public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2015", "Dell", "240");

        Monitor theMonitor=new Monitor("27 inch Beast","HP",40," 2540 x 1440");

        Motherboard theMotherboard=new Motherboard("BJ-200","Asus",4,6,"v2.44");
PersonalComputer thePc=new PersonalComputer("220","Dell",theCase,theMonitor,theMotherboard);
//thePC.getMonitor().drawPixelAt(10,5,"Black");
//thePC.getMotherboard().loadProgram("Mac");
//thePC.getComputerCase().pressPowerButton();
        thePc.powerUp();

    }
}
