package tugas;

/*
 * @author Nafiaaeluv
 */
public class Windows extends Laptop{
    public String fitur;
    
    Windows(){
        
    }
    
    Windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, 
            String jnsBatrei, String fitur){
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.fitur = fitur;
    }
    
    void tampilWindows(){
        System.out.println("\n==========||Data Laptop Windows||==========");
        super.tampilLaptop();
        System.out.println("Fitur               : " + fitur);
    }
}