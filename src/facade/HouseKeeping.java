package facade;

/**
 * HouseKeeping service class responsible for room cleaning
 */
public class HouseKeeping implements HotelService {
    
    /**
     * Cleans the specified room
     * @param roomNumber The room number to be cleaned
     */
    public void cleanRoom(int roomNumber) {
        System.out.println("HouseKeeping: Cleaning room number " + roomNumber);
    }
}