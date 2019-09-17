
/**
 * Beschreiben Sie hier die Klasse Konsumgerät.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Konsumgerät
{
    public boolean status;
    public String name;
    
    public Konsumgerät(String na){
        this.status = false;
        this.name = na;
    }
    
    public void statusEin(){
        this.status = true;
    }
    
    public String toString(){
        String ausgabe = this.name + " " + this.status + "\n";
        
        return ausgabe;
    }
}
