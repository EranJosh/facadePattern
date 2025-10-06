package facade;

/**
 * Cart service class responsible for handling luggage cart requests
 */
public class Cart implements HotelService {
    
    /**
     * Requests luggage carts for the guest
     * @param numberOfCarts The number of carts requested
     */
    public void requestCart(int numberOfCarts) {
        System.out.println("Cart: Requesting " + numberOfCarts + " luggage cart(s)");
    }
}