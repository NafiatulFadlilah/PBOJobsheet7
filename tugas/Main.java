package tugas;

/*
 * @author Nafiaaeluv
 */
public class Main {
    public static void main(String[] args){
        Mac mac = new Mac("MacBook pro", 4, 8, "Intel Core i5", "Lithium-Polymer", "Apple M1 Chip");
        Windows win = new Windows("HP Spectre X360", 5, 16, "Intel Core i7", "Lion-Polymer", "Fingerprint Scanner");
        Pc pc = new Pc("Dell XPS AIO 27", 3, 1000, "Intel Core i5", 27);
        
        mac.tampilMac();
        win.tampilWindows();
        pc.tampilPc(); 
    }
}