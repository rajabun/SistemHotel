import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Class Admin merupakan kondisi akun admin yang sudah logon. Berisi data yang dimiliki admin.
 *
 * @author Muhammad Rajab/1206244415
 * @version 16-05-2017
 */
public class Admin extends User
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Admin
     */
    public Admin() 
    {
        // initialise instance variables
        //Method m = Admin.class.getDeclaredMethod("AddNewRoom");
        //m.invoke(d);// throws java.lang.IllegalAccessException
        //m.setAccessible(true);// Abracadabra 
        //m.invoke(d);// now its OK

    }

    /**
     * Method untuk menambah ruangan ke database ruangan
     * 
     * @param data Parameter dari method AddNewRoom yang merujuk ke kelas Room
     * @return true/false Mengembalikan isi data dari method ini dengan nilai true/false
     */
    //public static boolean AddNewRoom(Room data)
    private static boolean AddNewRoom(Room data)
    {
        for (int i = 0; i < DataRoom.getDatabaseRuangan().size(); i++)
        {
            if(DataRoom.getDatabaseRuangan().get(i).equals(data))
            {
                System.out.println("Data Ruangan sudah terdaftar dalam Database\n");
                return false;
            }
        }
        DataRoom.DataRoom.add(data);
        System.out.println("\nRuangan baru berhasil ditambah\n");
        return true;
    }

    /**
     * Method untuk menghapus ruangan dari database ruangan
     * 
     * @param data Parameter dari method RemoveRoom yang merujuk ke kelas Room
     * @return true/false Mengembalikan isi data dari method ini dengan nilai true/false
     */
    //public static boolean RemoveRoom(Room data)
    private static boolean RemoveRoom(Room data)
    {
        if(DataRoom.getDatabaseRuangan().isEmpty())
        {
            System.out.println("Tidak ada ruangan dalam database\n");
            return false;
        }
        else
        {
            for (int i = 0; i < DataRoom.getDatabaseRuangan().size(); i++)
            {
                if(DataRoom.getDatabaseRuangan().get(i).equals(data))
                {
                    DataRoom.getDatabaseRuangan().remove(i);
                    //a = i+1;
                    System.out.println("Data ruangan berhasil dihapus\n");
                    return true;
                }
            }
        }
        System.out.println("Ruangan tidak berhasil dihapus\n");
        return false;
    }

    /**
     * Metode untuk mengganti ketersediaan ruangan
     */
    //public static void ChangeRoomAvailability(String roomName, boolean available)
    private static void ChangeRoomAvailability(String roomName, boolean available)
    {
        for (int i = 0; i < DataRoom.getDatabaseRuangan().size(); i++)
        {
            if(DataRoom.getDatabaseRuangan().get(i).getRoomName().equals(roomName))
            {
                System.out.println("Ruangan ditemukan");
                DataRoom.getDatabaseRuangan().get(i).setStatusAvailability(available);
                //DataRoom.getDatabaseRuangan().set(i);                
            }
        }
    }

    /**
     * Metode untuk menerima pembayaran
     */
    public static void ReceivePayment(int saldo)
    //private static void ReceivePayment(int saldo)
    {
        saldoAdmin = saldo;
    }
}
