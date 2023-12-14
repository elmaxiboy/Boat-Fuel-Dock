package homework;

public class FuelDock {

    private double fuelPrice;
    private double batteryMaxCharge;
    private double batteryPrice;


    public FuelDock(double fuelPrice, double batteryMaxCharge, double
            batteryPrice){
        this.fuelPrice=fuelPrice;
        this.batteryMaxCharge=batteryMaxCharge;
        this.batteryPrice=batteryPrice;
    }

    public void service(Motorboat boat){

        double addedFuel=boat.refuel();
        double refillPrice=fuelPrice*addedFuel;

        System.out.println("Total price refill: "+refillPrice+"\n");

    }

    /*a public method service(HybridBoat hybridBoat) that:
    i. calls the refuel() method on hybridBoat,
    ii. calculates the price of the sold fuel,
    iii. if the battery of hybridBoat is depleted:
    A. replaces the battery,
    B. adds the price for the battery replacement,
    C. prints ”Total price refill and battery replacement: ¿ price” and a new line.
    iv. otherwise prints ”Total price refill: ¿ price” and a new line*/

    public void service(HybridBoat hybridBoat){

        double addedFuel=hybridBoat.refuel();
        double refillPrice=fuelPrice*addedFuel;

        if (hybridBoat.isBatteryDepleted()){
            Battery newBattery = new Battery(batteryMaxCharge);
            hybridBoat.replaceBattery(newBattery);
            double totalPrice = refillPrice+batteryPrice;
            System.out.println("Total price refill and battery replacement"+refillPrice+"\n");
        }

        else{
            System.out.println("Total price refill: "+refillPrice+"\n");
        }


    }
}
