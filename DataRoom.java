import java.util.ArrayList;

/**
 * Class DataRoom berisi database dari akun ruangan.
 *
 * @author Muhammad Rajab/1206244415
 * @version 16-05-2017
 */
public class DataRoom
{
    // instance variables - replace the example below with your own
    public static ArrayList<Room> DataRoom = new ArrayList<Room>();
    static int a = 0;
    /**
     * Constructor for objects of class DataRoom
     */
    public DataRoom()
    {
        // initialise instance variables
    }

    /**
     * Method untuk melihat database customer
     */
    public static void lihatDatabaseRuangan()
    {
        System.out.println(DataRoom);        
    }
    
    /**
     * Method untuk mengembalikan instance database customer
     * @return Akun Mengembalikan isi data dari instance variable Akun
     */
    public static ArrayList <Room> getDatabaseRuangan()
    {
        return DataRoom;
    }
    
    /**
     * Method untuk menampilkan data customer
     * @return Akun Mengembalikan isi data dari instance variable Akun
     */
    public static Room getRuangan()
    {
        for (int i = 0; i < DataRoom.size(); i++)
        {
            System.out.println(DataRoom.get(i));
            a = i;
        }
        return DataRoom.get(a);
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
}
