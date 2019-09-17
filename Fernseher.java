
/**
 * Beschreiben Sie hier die Klasse Fernseher.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Fernseher extends Radio
{
    public int farbkr;
    public int helligkeit;
    
    public Fernseher(String na, int la, double fr, int kontr, int hell){
        super(na, la , fr);
        this.farbkr = kontr;
        this.helligkeit = helligkeit;
    }
    
    public void aenderHelligkeit(int hellNeu){
        this.helligkeit = hellNeu;
    }
    
    public void aenderKontrast(int kont){
        this.farbkr = kont;
    }
    public String toString(){
        return super.toString() + " " + this.farbkr + " " +this.helligkeit + "\n";
    }
}
