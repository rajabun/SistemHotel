import java.util.Scanner;

/**
 * Class Customer merupakan kondisi akun customer yang sudah logon. Berisi data yang dimiliki customer.
 *
 * @author Muhammad Rajab/1206244415
 * @version 16-05-2017
 */
public class Customer extends User
{
    // instance variables - replace the example below with your own
    public int NumberOfBookingDay;
    public TipeRuangan ruangan;
    public int harga;
    public static Scanner keyboard = new Scanner (System.in);
    
    /**
     * Constructor for objects of class Customer
     */
    public Customer()
    {
        // initialise instance variables
    }

    /**
     * Method untuk memilih ruangan
     * @param ruangan Parameter dari method SelectRoom yang merujuk ke class TipeRuangan
     */
    public void SelectRoom(TipeRuangan ruangan)
    {
        this.ruangan = ruangan;
        if(ruangan == TipeRuangan.SingleRoom)
        {
            ruangan = TipeRuangan.SingleRoom;
        }

        else if(ruangan == TipeRuangan.DoubleRoom)
        {
            ruangan = TipeRuangan.DoubleRoom;
        }

        else if(ruangan == TipeRuangan.PremiumRoom)
        {
            ruangan = TipeRuangan.PremiumRoom;
        }
    }
    
    /**
     * Method untuk menambah(memasukkan) saldo
     * @param top Parameter dari method TopUpSaldo berupa integer
     */
    private void TopUpSaldo(int top)
    //public void TopUpSaldo(int top)
    {
        saldo = saldo + top;
    }
    
    /**
     * Method untuk membayar booking ruangan
     * @param booking Parameter dari method PayBooking berupa integer
     */
    //private void PayBooking(int booking)
    private void PayBooking()
    {
        System.out.println("\nBerapa hari anda ingin menginap ?\n");
        NumberOfBookingDay = keyboard.nextInt();
        //NumberOfBookingDay = booking;
        if(ruangan == TipeRuangan.SingleRoom)
        {
            harga = 500000*NumberOfBookingDay;
            saldo = saldo - harga;
            Admin.ReceivePayment(saldo);
        }

        else if(ruangan == TipeRuangan.DoubleRoom)
        {
            harga = 750000*NumberOfBookingDay;
            saldo = saldo - harga;
            Admin.ReceivePayment(saldo);
        }

        else if(ruangan == TipeRuangan.PremiumRoom)
        {
            if(NumberOfBookingDay > 3)
            {
                harga = 1000000*NumberOfBookingDay*10/100;
                saldo = saldo - harga;
                Admin.ReceivePayment(saldo);
            }
            else
            {
                harga = 1000000*NumberOfBookingDay;
                saldo = saldo - harga;
                Admin.ReceivePayment(saldo);
            }
        }
    }

}
