package tugas;

/*
 * @author Nafiaaeluv
 */
public class Komputer {
    public String merk;
    public int kecProsesor;
    public int sizeMemory;
    public String jnsProsesor;
    
    Komputer(){
        
    }
    
    Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor){
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }
    
    void tampilData(){
        System.out.println("Merk                : " + merk);
        System.out.println("Kecepatan Prosesor  : " + kecProsesor);
        System.out.println("Size Memory         : " + sizeMemory);
        System.out.println("Jenis Prosesor      : " + jnsProsesor);
    }
}