package homework ;
public class Motorboat {
    private double fuel ;
    private double sizeTank ;
    private double fuelConsumption ;
    public Motorboat ( double sizeTank , double fuelConsumption ) {
        this . fuel = 0;
        this . sizeTank = sizeTank ;
        this . fuelConsumption = fuelConsumption ;
    }
    protected double refuel () {
        double addedFuel = sizeTank - fuel ;
        fuel = sizeTank ;
        System . out . println ("Refilled " + addedFuel + " liters ")
        ;
        return addedFuel ;
    }
    public void sail ( double miles ) {
        fuel -= miles * fuelConsumption ;
        System . out . println ("I sailed for " + miles + " miles ") ;
        System . out . println ("Fuel left : " + fuel + " liters \n")
        ;
    }
}