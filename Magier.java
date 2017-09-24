
/**
 * Beschreiben Sie hier die Klasse Magier.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Magier extends Mensch
{
        int Kraft=25;
    int Ausdauer=30;
      String[] Inventar=new String[30];
    int Intelligenz=90;
     
    public Magier()
    { 
   
        Inventar[0]="Kompass";
       
    }
    public String sagItem(){
    
    return Inventar[0];
    
    
    }
    public void nehme(int n,String m){
    
        Inventar[n]=m;
        System.out.println("du hast im "+n+" Slot einen"+m);
        
        
        
        
    }
    }

