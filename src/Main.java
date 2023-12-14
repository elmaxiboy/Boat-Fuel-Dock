import homework . Battery ;
import homework . FuelDock ;
import homework . HybridBoat ;

public class Main {
    public static void main ( String [] args ) {
        FuelDock dock = new FuelDock (1.7, 10, 50) ;
        HybridBoat hybridBoat = new HybridBoat (10, 0.1, 0.2, new Battery (8) ) ;
        dock . service ( hybridBoat ) ;
        hybridBoat . sail (100) ;
        dock . service ( hybridBoat ) ;
        hybridBoat . sail (20) ;
    }
}