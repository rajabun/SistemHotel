import java.util.ArrayList;

/**
 * Class DatabaseUser berisi database dari akun customer dan akun admin.
 *
 * @author Muhammad Rajab/1206244415
 * @version 16-05-2017
 */
public class DatabaseUser
{
    // instance variables - replace the example below with your own
    public static ArrayList <UserAccount> Akun = new ArrayList <UserAccount>();
    public static ArrayList <AdminAccount> AkunAdmin = new ArrayList <AdminAccount>();
    public static int a = 0;
    public static int b = 0;
    
    /**
     * Constructor for objects of class DatabaseUser
     */
    public DatabaseUser()
    {
        // initialise instance variables
    }

    /**
     * Method untuk memasukkan customer kedalam database customer
     * 
     * @param tambahin Parameter dari method tambahCustomer yang merujuk ke class UserAccount
     */
    public static boolean tambahCustomer(UserAccount tambahin)
    {
        for (int i = 0; i < Akun.size(); i++)
        {
            if(Akun.get(i).equals(tambahin))
            {
                System.out.println("Data Customer sudah terdaftar dalam Database\n");
                return false;
            }
        }
        Akun.add(tambahin);
        System.out.println("Penambahan Customer dalam Database Berhasil\n");
        return true;
    }
    
    /**
     * Method untuk melihat database customer
     */
    public static void lihatDatabaseUser()
    {
        System.out.println(Akun);        
    }
    
    /**
     * Method untuk mengembalikan instance database customer
     * @return Akun Mengembalikan isi data dari instance variable Akun
     */
    public static ArrayList <UserAccount> getDatabaseUser()
    {
        return Akun;
    }
    
    /**
     * Method untuk menampilkan data customer
     * @return Akun Mengembalikan isi data dari instance variable Akun
     */
    public static UserAccount getAkun()
    {
        for (int i = 0; i < Akun.size(); i++)
        {
            System.out.println(Akun.get(i));
            a = i;
        }
        return Akun.get(a);
    }
    
    /**
     * Method untuk memasukkan admin kedalam database admin
     * 
     * @param tambahin Parameter dari method tambahAdmin yang merujuk ke class AdminAccount
     */
    public static boolean tambahAdmin(AdminAccount tambahin)
    {
         for (int i = 0; i < Akun.size(); i++)
        {
            if(AkunAdmin.get(i).equals(tambahin))
            {
                System.out.println("Data Admin sudah terdaftar dalam Database\n");
                return false;
            }
        }
        AkunAdmin.add(tambahin);
        System.out.println("Penambahan Admin dalam Database Berhasil\n");
        return true;
    }
    
    /**
     * Method untuk melihat database admin
     */
    public static void lihatDatabaseAdmin()
    {
        System.out.println(AkunAdmin);        
    }
    
    /**
     * Method untuk mengembalikan instance database admin
     * @return AkunAdmin Mengembalikan isi data dari instance variable AkunAdmin
     */
    public static ArrayList <AdminAccount> getDatabaseAdmin()
    {
        return AkunAdmin;
    }
    
    /**
     * Method untuk menampilkan data customer
     * @return AkunAdmin Mengembalikan isi data dari instance variable AkunAdmin
     */
    public static AdminAccount getAkunAdmin()
    {
        for (int i = 0; i < AkunAdmin.size(); i++)
        {
            System.out.println(AkunAdmin.get(i));
            b = i;
        }
        return AkunAdmin.get(b);
    }
}
