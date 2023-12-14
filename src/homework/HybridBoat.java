package homework;

public class HybridBoat extends Motorboat {
    private Battery  battery;
    private double electricityConsumption;

    public HybridBoat(double sizeTank, double fuelConsumption, double
            electricityConsumption, Battery battery){

        super(sizeTank, fuelConsumption);
        this.electricityConsumption = electricityConsumption;
        this.battery=battery;

    }

    protected void replaceBattery(Battery battery){

        this.battery = battery;
         double charge = this.battery.getCharge();

        System.out.println("Battery replaced. Current charge: "+charge+" kWh \n");

    }

    /*i. if the charge is sufficient:


    A. prints ”I sailed for miles miles”
    B. uses the charge of the battery accordingly
    C. prints ”Charge left : charge kWh”, where charge correponds to the charge of the
    battery
    D. prints a new line


    ii. if the charge is not sufficient:
    A. sails the boat to the maximum distance possible with the available charge and
    prints ”I sailed for chargeMaxMiles miles”
    B. prints ”Battery depleted”,
    C. calls the method sail(...) of the superclass Motorboat to cover the remaining
    distance using fuel.
            (assume that there is always enough fuel to cover any distance using fuel)*/
    @Override
    public void sail(double miles) {
        double chargeToUse= electricityConsumption*miles;
        double chargeLeft = battery.getCharge()-chargeToUse;
        if (chargeLeft>0){
            System.out.println("I sailed for: " +miles+"\n");
            battery.useCharge(chargeToUse);
            System.out.println("Charge left : " +chargeLeft+ " kWh\n");
        }
        else{
            double chargeMaxMiles= miles/battery.getCharge();
            System.out.println("I sailed for "+chargeMaxMiles+" miles\n");
            System.out.println("Battery depleted\n");
            super.sail(miles-chargeMaxMiles);
        }

    }

    boolean isBatteryDepleted(){
        return battery.getCharge() < 0.0001;

    }

}

