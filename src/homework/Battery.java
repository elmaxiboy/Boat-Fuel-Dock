package homework ;
public class Battery {
    private double charge ;
    public Battery ( double charge ) {
        this . charge = charge ;
    }
    public double getCharge () {
        return charge ;
    }
    public void useCharge ( double kW ) {
        this . charge -= kW ;
    }
}
