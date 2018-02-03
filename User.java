import java.util.Scanner;

/**
 * Class User berisi fungsi awal untuk mengakses sistem hotel.
 *
 * @author Muhammad Rajab/1206244415
 * @version 16-05-2017
 */
public class User
{
    // instance variables - replace the example below with your own
    public int userID;
    public int adminID;
    public String username;
    public String password;
    public static int saldo;
    public static int saldoAdmin;
    public boolean loginStatus;
    public static Scanner keyboard = new Scanner (System.in);
    public int a;
    public int b;
    
    /**
     * Constructor for objects of class User
     */
    public User()
    {
        // initialise instance variables        
    }

    /**
     * Metode untuk mengecek status login
     */
    public boolean checkLoginStatus()
    {
        if (loginStatus == true)
        {
            System.out.print("\nAnda sudah dalam keadaan login\n");
            return true;
        }
        else
        {
            System.out.print("\nAnda tidak dalam keadaan login.\n");
            return false;
        }
    }

    /**
     * Metode login akun untuk masuk kedalam sistem
     */
    public void Login()
    {
        System.out.print("\nMasukan nama akun : ");  
        String inpUser = keyboard.nextLine();
        System.out.print("\nMasukan password : ");  
        String inpPass = keyboard.nextLine(); // gets input from user

        if(loginStatus == false)
        {
            for (int i = 0; i < DatabaseUser.getDatabaseUser().size(); i++){
                a = i;
                UserAccount u = DatabaseUser.getDatabaseUser().get(i);
                if (inpUser.equals(u.getNamaAkun()) && inpPass.equals(u.getPassword()) &&
                u.getTipeUser().equals(TipeUser.Customer))
                {
                    System.out.print("Login Customer berhasil");
                    loginStatus = true;
                    username = u.getNamaAkun();
                    saldo = u.getSaldo();
                    //Customer c = new Customer();
                }
                else
                {
                    for (int f = 0; f < DatabaseUser.getDatabaseAdmin().size(); f++){
                        b = f;
                        AdminAccount d = DatabaseUser.getDatabaseAdmin().get(f);
                        if (inpUser.equals(d.getNamaAkun()) && inpPass.equals(d.getPassword())
                        && d.getTipeUser().equals(TipeUser.Admin))
                        {
                            System.out.print("Login Admin berhasil");
                            loginStatus = true;
                            username = d.getNamaAkun();
                            saldo = d.getSaldo();
                            //Admin e = new Admin();
                        }
                        else
                        {
                            System.out.print("Login gagal, silahkan coba lagi");
                            loginStatus = false;                    
                        }
                    }                    
                }
            }
        }
        else
        {
            System.out.print("\nAnda sudah dalam keadaan login\n");
        }

    }

    /**
     * Metode untuk membuat akun customer baru
     */
    public void createCustomerAccount(int saldo)
    {
        UserAccount u = new UserAccount();
        //System.out.print("\nMasukan saldo awal : ");  
        u.setSaldo(saldo);
        DatabaseUser.tambahCustomer(u);
        DatabaseUser.getAkun();
    }

    /**
     * Metode untuk membuat akun admin baru
     */
    public void createAdminAccount()
    {
        AdminAccount u = new AdminAccount();
        DatabaseUser.tambahAdmin(u);
        DatabaseUser.getAkunAdmin();
    }

    /**
     * Metode logout akun untuk keluar sistem
     */
    public void Logout()
    {
        System.out.print("\nLogout berhasil\n");
        loginStatus = false;
        /*
        UserAccount u = DatabaseUser.getDatabaseUser().get(a);
        AdminAccount d = DatabaseUser.getDatabaseAdmin().get(b);

        if (u.getTipeUser().equals(TipeUser.Customer))
        {
            u.setSaldo(saldo);
            System.out.print("\nLogout berhasil\n");
            loginStatus = false;
        }
        else if (d.getTipeUser().equals(TipeUser.Admin))
        {
            d.setSaldo(saldo);
            System.out.print("\nLogout berhasil\n");
            loginStatus = false;
        }
        else
        {
            System.out.print("\nLogout gagal\n");
        }
        */
    }

    public void checkSaldo()
    {
        System.out.println("\nSaldo saat ini : " + saldo);        
    }

    public int getSaldo(){
        return a;
    }
}
