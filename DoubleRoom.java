
/**
 * Class DoubleRoom berisi data untuk jenis ruangan double.
 *
 * @author Muhammad Rajab/1206244415
 * @version 16-05-2017
 */
public class DoubleRoom extends Room
{
    // instance variables - replace the example below with your own
    //public String category;
    public TipeBed category; //TipeBed merupakan enum
    
    /**
     * Constructor for objects of class DoubleRoom
     */
    public DoubleRoom(String roomName, int roomNumber, String guestOneName, String guestTwoName, TipeBed category)
    {
        // initialise instance variables
        super(roomName, roomNumber);
        //setRoomName(roomName);
        setGuestOneName(guestOneName);
        setGuestTwoName(guestTwoName);
        //guestTwoName = getGuestName();
        setDailyRoomTarif(750000);
        setTipeBed(category);
        setStatusRoom(TipeRuangan.DoubleRoom);
    }

    /**
     * Method untuk memasukkan kategori tempat tidur
     * @param category Parameter dari method setTipeBed yang merujuk ke class TipeBed
     */
    public void setTipeBed(TipeBed category){
        this.category = category;
    }
    
    /**
     * Method untuk menampilkan tipe tempat tidur
     * @return category Mengembalikan isi data dari instance variable category
     */
    public TipeBed getTipeBed()
    {
        return category;
    }
    
    /**
     * Method untuk menampilkan toString dari class ini
     */
    public String toString() {
        System.out.println("\nNama ruangan : " + roomName + "\nNama Tamu 1 : " + guestOneName + 
        "\nNama Tamu 2 : " + guestTwoName + "\nTipe Ruangan : " + status +
        "\nTarif sewa per hari : " + dailyRoomTarif);
        return "";
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
}

