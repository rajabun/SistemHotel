import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class UserAccount berisi variabel data informasi dasar dari akun customer.
 *
 * @author Muhammad Rajab/1206244415
 * @version 16-05-2017
 */
public class UserAccount
{
    // instance variables - replace the example below with your own
    public String username;
    public String password;
    public String alamat;
    public String noHP;
    public String email;
    public int userID;
    public static int saldo;
    public TipeUser tipe;
    public static Scanner sc = new Scanner(System.in);

    /**
     * Constructor for objects of class UserAccount
     */
    public UserAccount()
    {
        // initialise instance variables
        setNamaAkun();
        setPassword();
        setAlamat();
        setNoHp();
        setEmail();
        //setSaldo();
        setTipeUser(TipeUser.Customer);
        setID();
        System.out.println("\nTerdaftar sebagai customer\n");
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
     * Method untuk memasukkan alamat akun
     */
    public void setAlamat(){
        //@param tipe Parameter dari method setAlamat dalam bentuk string
        //public void setAlamat(String alamat)
        //this.alamat = alamat;
        System.out.print("\nMasukan alamat : ");  
        alamat = sc.nextLine();
    }

    /**
     * Method untuk memasukkan nomer HP akun
     */
    public boolean setNoHp(){
        //@param tipe Parameter dari method setNoHP dalam bentuk String
        //public void setNoHp(String noHP)
        //this.noHP = noHP;
        System.out.print("\nFormat nomer HP minimal 7 digit, maksimal 12 digit\nMasukan no HP : ");  
        noHP = sc.nextLine();

        //untuk validasi nomer telepon dengan maksimal 12 digit dengan format "081234567890"
        // \ : Nothing, but quotes the following character
        // \d : Matches the digits. Equivalent to [0-9]. (Bukan \d karena \ merupakan special escape sequences for String, bertabrakan fungsinya)
        // re{n,m} : Matches at least n but not more than m times
        // \\d{7,12} berarti 7410000 atau 012345678901
        if (noHP.matches("\\d{7,12}")) 
        {
            noHP = noHP;
            System.out.println(noHP + " : " + noHP.matches("\\d{7,12}") + "\n");
            return true;
        }

        //return false jika tidak ada input yang sesuai (matches)
        else
        {
            noHP = null;
            System.out.println("Maaf format nonor telepon yang ada masukan salah\n");
            return false;
        }
    }

    /**
     * Method untuk memasukkan email akun
     */
    public boolean setEmail(){
        //@param email Parameter dari method setEmail dalam bentuk String
        //public void setEmail(String email)
        //this.email = email;
        System.out.print("\nFormat email harus sesuai dengan aturan.\nContoh : rajab@admin.com\nMasukan email : ");  
        email = sc.nextLine();

        // ^ : Matches the beginning of the line
        // (re) : Grouping
        // . : Any character (may or may not match line terminators)
        // re+ : Matches 1 or more of the previous thing
        // @ : untuk @ dalam format email
        // $ : Matches the end of the line
        // ^(.+)@(.+)$ berarti abcde,123@abcde.com

        String regex = "^(.+)@(.+)$"; //membuat string yang akan digunakan pada class Pattern

        //A regular expression, specified as a string, must first be compiled into an instance of this class
        Pattern pattern = Pattern.compile(regex); 
        //The resulting pattern can then be used to create a Matcher object that can match arbitrary character sequences against the regular expression.
        Matcher matcher = pattern.matcher((CharSequence) email);

        if(matcher.matches() == true)
        {
            email = email;
            //All of the state involved in performing a match resides in the matcher, so many matchers can share the same pattern.
            System.out.println(email + " : " + matcher.matches() + "\n");
        }

        else if(matcher.matches() == false)
        {
            //All of the state involved in performing a match resides in the matcher, so many matchers can share the same pattern.
            email = null;
            System.out.println("Maaf format email yang anda masukan salah" + " : "+ matcher.matches() + "\n");
        }
        return matcher.matches(); //mengembalikan hasil validasi apakah true atau false
    }

    /**
     * Method untuk memasukkan id akun
     */
    public void setID()
    {
        userID = userID + 1;               
    }

    /**
     * Method untuk memasukkan saldo akun
     * @param saldo Parameter dari method setSaldo dalam bentuk int
     */
    public static void setSaldo(int saldoUser)
    {
        //public static void setSaldo(){
        saldo = saldoUser;
        //System.out.print("\nMasukan saldo awal : ");  
        //saldo = sc.nextInt();
    }

    /**
     * Method untuk menampilkan tipe user
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
     * Method untuk menampilkan alamat akun
     * @return alamat Mengembalikan isi data dari instance variable alamat
     */
    public String getAlamat(){
        return alamat;
    }

    /**
     * Method untuk menampilkan noHP akun
     * @return noHP Mengembalikan isi data dari instance variable noHP
     */
    public String getNoHp(){
        return noHP;
    }

    /**
     * Method untuk menampilkan email akun
     * @return email Mengembalikan isi data dari instance variable email
     */
    public String getEmail(){
        return email;
    }

    /**
     * Method untuk menampilkan ID akun
     * @return userID Mengembalikan isi data dari instance variable userID
     */
    public int getID(){
        return userID;
    }

    /**
     * Method untuk menampilkan saldo akun
     * @return saldo Mengembalikan isi data dari instance variable saldo
     */
    public static int getSaldo(){
        return saldo;
    }

    /**
     * Method untuk menampilkan toString dari class ini
     */
    public String toString() {
        System.out.println("\nTipe Akun : " + tipe + "\nID : " + userID + "\nNama User : " + username + " \nalamat : " + alamat + "\nnoHP : " + noHP +
            "\nemail : " + email + "\nsaldo : " + saldo);
        return "";
    }
}
