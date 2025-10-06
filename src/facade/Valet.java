package facade;

/**
 * Valet service class responsible for vehicle parking and pick-up
 */
public class Valet implements HotelService {
    
    /**
     * Handles vehicle pick-up for the guest
     * @param plateNumber The vehicle's plate number
     */
    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet: Picking up vehicle with plate number " + plateNumber);
    }
}