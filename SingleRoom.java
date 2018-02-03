
/**
 * Class SingleRoom berisi data untuk jenis ruangan single.
 *
 * @author Muhammad Rajab/1206244415
 * @version 16-05-2017
 */
public class SingleRoom extends Room
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class SingleRoom
     */
    public SingleRoom(String roomName, int roomNumber, String guestName)
    {
        // initialise instance variables
        super(roomName, roomNumber);
        //setRoomName(roomName);
        setDailyRoomTarif(500000);
        setGuestOneName(guestName);
        setGuestTwoName(null);
        setStatusRoom(TipeRuangan.SingleRoom);
    }

    /**
     * Method untuk menampilkan toString dari class ini
     */
    public String toString() {
        System.out.println("\nNama ruangan : " + roomName + "\nNama Tamu : " + guestOneName
        + "\nTipe Ruangan : " + status + "\nTarif sewa per hari : " + dailyRoomTarif);
        return "";
    }
}
