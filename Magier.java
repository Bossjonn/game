

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
     
    int Intelligenz=90;
  
    public Magier()
    { 
   

       
    }
    public void setMensch(Mensch pMensch){
        pMensch.setKraft(Kraft);
        pMensch.setAusdauer(Ausdauer);
        pMensch.setIntelligenz(Intelligenz);
    
    
    
    
    }
    }

