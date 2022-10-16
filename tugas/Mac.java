package tugas;

/*
 * @author Nafiaaeluv
 */
public class Mac extends Laptop{
    public String security;
    
    Mac(){
        
    }
    
    Mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, 
            String jnsBatrei, String security){
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.security = security;
    }
    
    void tampilMac(){
        System.out.println("\n==========||Data Laptop MAC||==========");
        super.tampilLaptop();
        System.out.println("Security            : " + security);
    }
}