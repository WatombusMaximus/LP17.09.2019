import java.util.ArrayList;

public class Haus{
    
    public ArrayList<Konsumgerät> geraete = new ArrayList<>();
    
    public Haus(){
        this.geraete = new ArrayList<>();
    }
    
    public void geraetHinzufuegen(Konsumgerät geraet){
        this.geraete.add(geraet);
    }
    
    public void urlaub(){
        for(Konsumgerät geraet : geraete){
            geraet.status = false;
        }
    }
   
    public String toString(){
        String ausgabe = "";
        for(Konsumgerät geraet : geraete){
            ausgabe += geraet.toString();
        }
        return ausgabe;
    }
    
    public void ausgebenAlla(){
        System.out.println(toString());
    }
}