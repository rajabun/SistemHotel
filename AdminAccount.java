import java.util.Scanner;

/**
 * Class AdminAccount berisi variabel data informasi dasar dari akun admin. 
 * 
 * @author Muhammad Rajab/1206244415
 * @version 16-05-2017
 */
public class AdminAccount
{
    // instance variables - replace the example below with your own
    public String username;
    public String password;
    public int adminID;
    public static int saldoAdmin;
    public TipeUser tipe;
    public static Scanner sc = new Scanner(System.in);

    /**
     * Constructor for objects of class AdminAccount
     */
    public AdminAccount()
    {
        // initialise instance variables
        setNamaAkun();
        setPassword();
        setTipeUser(TipeUser.Admin);
        setID();
    }

    /**
     * Method untuk memasukkan status user
     * (tambah sendiri)
     * @param tipe Parameter dari method setTipeUser yang merujuk ke class TipeUser
     */
    //public void setTipeUser(){
    public void setTipeUser(TipeUser tipe){
        this.tipe = tipe;
    }

    /**
     * Method untuk memasukkan nama akun
     */
    public void setNamaAkun(){
        //@param tipe Parameter dari method setNamaAkun dalam bentuk string
        //public void setNamaAkun(String username)
        //this.username = username;
        System.out.print("\nMasukan nama akun : ");  
        username = sc.nextLine();
    }

    /**
     * Method untuk memasukkan password akun
     */
    public void setPassword(){
        //@param tipe Parameter dari method setNamaAkun dalam bentuk string
        //public void setPassword(String password)
        //this.password = password;
        System.out.print("\nMasukan password : ");  
        password = sc.nextLine();
    }

    /**
     * Method untuk memasukkan id akun
     */
    public void setID()
    {
        adminID = adminID + 1;               
    }

    /**
     * Method untuk memasukkan saldo akun
     * @param saldo Parameter dari method setSaldo dalam bentuk int
     */
    public static void setSaldo(int saldo)
    {
        //public static void setSaldo(){
        //System.out.print("\nMasukan saldo awal : ");  
        //saldoAdmin = sc.nextInt();
        saldoAdmin = saldo;
    }

    /**
     * Method untuk menampilkan tipe user
     * (tambah sendiri)
     * @return tipe Mengembalikan isi data dari instance variable tipe
     */
    public TipeUser getTipeUser()
    {
        return tipe;
    }

    /**
     * Method untuk menampilkan nama akun
     * @return username Mengembalikan isi data dari instance variable username
     */
    public String getNamaAkun(){
        return username;
    }

    /**
     * Method untuk menampilkan password akun
     * @return password Mengembalikan isi data dari instance variable password
     */
    public String getPassword(){
        return password;
    }

    /**
     * Method untuk menampilkan ID akun
     * @return adminID Mengembalikan isi data dari instance variable adminID
     */
    public int getID(){
        return adminID;
    }

    /**
     * Method untuk menampilkan saldo akun
     * @return saldoAdmin Mengembalikan isi data dari instance variable saldoAdmin
     */
    public static int getSaldo(){
        return saldoAdmin;
    }

    /**
     * Method untuk menampilkan toString dari class ini
     */
    public String toString() {
        System.out.println("\nTipe Akun : " + tipe + "\nID : " + adminID + 
            "\nNama User : " + username + "\nPassword : " + password + "\nSaldo Admin : " + saldoAdmin);
        return "";
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */

}
