
/**
 * Enumeration class TipeUser - berisi Tipe user untuk menentukan tipe akun.
 * 
 * @author Muhammad Rajab/1206244415
 * @version 16-05-2017
 */
public enum TipeUser
{
    Customer("Customer"), Admin("Administrator");
    
    private String deskripsi;
    
    TipeUser(String deskripsi)
    {
        this.deskripsi = deskripsi;
    }
    
    public String toString()
    {
        return deskripsi;
    }
}
