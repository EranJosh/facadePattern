package facade;

/**
 * Client class that uses the FrontDesk facade to access hotel services
 * Demonstrates the Facade design pattern by interacting only with FrontDesk
 */
public class HotelApp {
    
    public static void main(String[] args) {
        // Create the FrontDesk facade
        FrontDesk frontDesk = new FrontDesk();
        
        System.out.println("=== Guest Check-in Services ===");
        
        // Request luggage carts
        frontDesk.requestCart(2);
        
        // Request room cleaning
        frontDesk.cleanRoom(101);
        
        System.out.println("\n=== Guest Check-out Services ===");
        
        // Request vehicle pick-up
        frontDesk.pickUpVehicle("ABC-1234");
        
        // Request additional services
        frontDesk.cleanRoom(102);
        frontDesk.requestCart(1);
    }
}