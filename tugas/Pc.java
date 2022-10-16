package tugas;

/*
 * @author Nafiaaeluv
 */
public class Pc extends Komputer{
   public int ukuranMonitor;
   
   Pc(){
       
   }
   
   Pc(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, 
           int ukuranMonitor){
       super(merk, kecProsesor, sizeMemory, jnsProsesor);
       this.ukuranMonitor = ukuranMonitor;
   }
   
   void tampilPc(){
       System.out.println("\n==========||Data Komputer PC||==========");
       super.tampilData();
       System.out.println("Ukuran Monitor      : " + ukuranMonitor);
   }
}