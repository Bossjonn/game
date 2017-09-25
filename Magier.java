
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
      Gegendstang[] Inventar=new Gegendstang[30];
    int Intelligenz=90;
     Schlüssel Schlüssel=new Schlüssel();
    public Magier()
    { 
   
        Inventar[0]=Schlüssel;
       
    }
    public Gegendstang sagItem(){
    
    return Inventar[0]=new Schlüssel();
    
    
    }
    public void nehme(int n,Gegendstang m){
    
        Inventar[n]=m;
        System.out.println("du hast im "+n+" Slot einen"+m);
        
        
        
        
    }
    }

