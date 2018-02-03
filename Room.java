
/**
 * Class Room berisi variabel data informasi dasar dari ruangan.
 *
 * @author Muhammad Rajab/1206244415
 * @version 16-05-2017
 */
public class Room
{
    // instance variables - replace the example below with your own
    public int roomNumber;
    public double dailyRoomTarif;
    public boolean statusAvailability;
    public String roomName;
    public String guestOneName;    
    public String guestTwoName;    
    //public String guestName;
    public TipeRuangan status;

    /**
     * Constructor for objects of class Room
     */
    //public Room(String roomName, String guestName, int roomNumber, double dailyRoomTarif, boolean statusAvailability)
    public Room(String roomName, int roomNumber)
    {
        // initialise instance variables
        setRoomName(roomName);
        setRoomNumber(roomNumber);
    }

    /**
     * Method untuk memasukkan status ruangan
     * (tambah sendiri)
     * @param status Parameter dari method setStatusRoom yang merujuk ke class Ruangan
     */
    public void setStatusRoom(TipeRuangan status)
    {
        this.status = status;
        if(status == TipeRuangan.SingleRoom)
        {
            status = TipeRuangan.SingleRoom;
        }

        else if(status == TipeRuangan.DoubleRoom)
        {
            status = TipeRuangan.DoubleRoom;
        }

        else if(status == TipeRuangan.PremiumRoom)
        {
            status = TipeRuangan.PremiumRoom;
        }
    }

    /**
     * Method untuk memasukkan nomor ruangan
     * @param roomNumber Parameter dari method setRoomNumber dalam bentuk integer
     */
    public void setRoomNumber(int roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    /**
     * Method untuk memasukkan tarif ruangan per hari
     * @param dailyRoomTarif Parameter dari method setDailyRoomTarif dalam bentuk double
     */
    public void setDailyRoomTarif(double dailyRoomTarif)
    {
        this.dailyRoomTarif = dailyRoomTarif;
    }

    /**
     * Method untuk memasukkan status ketersediaan ruangan
     * @param statusAvailability Parameter dari method setStatusAvailability dalam bentuk boolean
     */
    public void setStatusAvailability(boolean statusAvailability)
    {
        this.statusAvailability = statusAvailability;
    }

    /**
     * Method untuk memasukkan nama ruangan
     * @param roomName Parameter dari method setRoomName dalam bentuk string
     */
    public void setRoomName(String roomName)
    {
        this.roomName = roomName;
    }

    /**
     * Method untuk memasukkan nama tamu pertama
     * @param guestOneName Parameter dari method setGuestOneName dalam bentuk string
     */
    public void setGuestOneName(String guestOneName)
    {
        this.guestOneName = guestOneName;
    }

    /**
     * Method untuk memasukkan nama tamu kedua
     * @param guestTwoName Parameter dari method setGuestTwoName dalam bentuk string
     */
    public void setGuestTwoName(String guestTwoName)
    {
        this.guestTwoName = guestTwoName;
    }
    
    /**
     * Method untuk menampilkan status user
     * (tambah sendiri)
     * @return status_user Mengembalikan isi data dari instance variable status_user
     */
    public TipeRuangan getStatusRoom()
    {
        return status;
    }

    /**
     * Method untuk menampilkan nomor ruangan
     * (tambah sendiri)
     * @return roomNumber Mengembalikan isi data dari instance variable roomNumber
     */
    public int getRoomNumber()
    {
        return roomNumber;
    }

    /**
     * Method untuk menampilkan tarif ruangan per hari
     * (tambah sendiri)
     * @return dailyRoomTarif Mengembalikan isi data dari instance variable dailyRoomTarif
     */
    public double getDailyRoomTarif()
    {
        return dailyRoomTarif;
    }

    /**
     * Method untuk menampilkan status ketersediaan ruangan
     * (tambah sendiri)
     * @return statusAvailability Mengembalikan isi data dari instance variable statusAvailability
     */
    public boolean getStatusAvailability()
    {
        return statusAvailability;
    }

    /**
     * Method untuk menampilkan nama ruangan
     * (tambah sendiri)
     * @return roomName Mengembalikan isi data dari instance variable roomName
     */
    public String getRoomName()
    {
        return roomName;
    }
    
    /**
     * Method untuk menampilkan nama tamu pertama
     * @return guestOneName Mengembalikan isi data dari instance variable guestOneName
     */
    public String getGuestOneName()
    {
        return guestOneName;
    }
    
    /**
     * Method untuk menampilkan nama tamu kedua
     * @return guestTwoName Mengembalikan isi data dari instance variable guestTwoName
     */
    public String getGuestTwoName()
    {
        return guestTwoName;
    }
    
    /**
     * Method untuk menampilkan toString dari class ini
     */
    public String toString() {
        System.out.println("\nNama ruangan : " + roomName + "\nTipe Ruangan : " + status + "\nTarif sewa per hari : " + 
        dailyRoomTarif + "\nStatus Kamar : " + statusAvailability);
        return "";
    }
}
