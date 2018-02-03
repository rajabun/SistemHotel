
/**
 * Enumeration class TipeRuangan - berisi Tipe ruangan.
 *
 * @author Muhammad Rajab/1206244415
 * @version 16-05-2017
 */
public enum TipeRuangan
{
    SingleRoom("Single Room"), DoubleRoom("Double Room"), PremiumRoom("Premium Room");
    
    private String deskripsi;
    
    TipeRuangan(String deskripsi)
    {
        this.deskripsi = deskripsi;
    }
    
    public String toString()
    {
        return deskripsi;
    }
}
