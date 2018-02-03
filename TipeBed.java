
/**
 * Enumeration class TipeBed - berisi Tipe tempat tidur untuk menentukan single atau double bed.
 *
 * @author Muhammad Rajab/1206244415
 * @version 16-05-2017
 */
public enum TipeBed
{
    SingleBed("Single Bed"), DoubleBed("Double Bed");
    
    private String deskripsi;
    
    TipeBed(String deskripsi)
    {
        this.deskripsi = deskripsi;
    }
    
    public String toString()
    {
        return deskripsi;
    }
}
