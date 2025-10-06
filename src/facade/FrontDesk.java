package facade;

/**
 * Facade class that provides a simplified interface to the hotel services
 * Coordinates interactions between the client and individual service classes
 */
public class FrontDesk {
    private Valet valet;
    private HouseKeeping houseKeeping;
    private Cart cart;
    
    /**
     * Constructor initializes all hotel services
     */
    public FrontDesk() {
        this.valet = new Valet();
        this.houseKeeping = new HouseKeeping();
        this.cart = new Cart();
    }
    
    /**
     * Delegates vehicle pick-up request to Valet service
     * @param plateNumber The vehicle's plate number
     */
    public void pickUpVehicle(String plateNumber) {
        valet.pickUpVehicle(plateNumber);
    }
    
    /**
     * Delegates room cleaning request to HouseKeeping service
     * @param roomNumber The room number to be cleaned
     */
    public void cleanRoom(int roomNumber) {
        houseKeeping.cleanRoom(roomNumber);
    }
    
    /**
     * Delegates luggage cart request to Cart service
     * @param numberOfCarts The number of carts requested
     */
    public void requestCart(int numberOfCarts) {
        cart.requestCart(numberOfCarts);
    }
}