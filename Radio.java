import java.util.HashMap;
/**
 * Beschreiben Sie hier die Klasse Radio.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Radio extends Konsumgerät

{    
    public int lautst;
    public double frequenz;
    public HashMap<Double, String> buttons;
    
    public Radio(String na, int la, double fr){
        super(na);
        this.lautst = la;        
        this.frequenz = fr;
        this.buttons = new HashMap<Double, String>();
    }
    
    public void statusAus(){
        status = false;
    }
    
    public void createButton(double fr, String text){
        this.buttons.put(fr, text);
    }
    
    public void changeLautstLauter(int zuErhoehen){
        this.lautst += zuErhoehen;
    }
    
    public void changeLautstLeiser(int zuVerringern){
        this.lautst -= zuVerringern;
    }
    
    public void aenderFr(double frNeu){
        this.frequenz = frNeu;
    }
    
    public String toString(){
        return super.toString() + " " + this.lautst + " " + this.frequenz + "\n";
    }
}
