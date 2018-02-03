
/**
 * Class PremiumRoom berisi data untuk jenis ruangan premium.
 *
 * @author Muhammad Rajab/1206244415
 * @version 16-05-2017
 */
public class PremiumRoom extends Room
{
    // instance variables - replace the example below with your own
    public double discountRate;
    
    /**
     * Constructor for objects of class PremiumRoom
     */
    public PremiumRoom(String roomName, int roomNumber, String guestName, double discountRate)
    {
        // initialise instance variables
        super(roomName,roomNumber);
        //setRoomName(roomName);
        setDailyRoomTarif(1000000);
        setGuestOneName(guestName);
        setGuestTwoName(null);
        setDiscountRate(discountRate);
        setStatusRoom(TipeRuangan.PremiumRoom);
    }

    /**
     * Method untuk memasukkan diskon
     * @param discountRate Parameter dari method setDiscountRate dalam double
     */
    public void setDiscountRate(double discountRate){
        this.discountRate = discountRate;
    }
    
    /**
     * Method untuk menampilkan diskon
     * @return discountRate Mengembalikan isi data dari instance variable discountRate
     */
    public double getDiscountRate()
    {
        return discountRate;
    }
    
    /**
     * Method untuk menampilkan toString dari class ini
     */
    public String toString() {
        System.out.println("\nNama ruangan : " + roomName + "\nNama Tamu : " + guestOneName
        + "\nTipe Ruangan : " + status + "\nTarif sewa per hari : " + dailyRoomTarif);
        return "";
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
}
