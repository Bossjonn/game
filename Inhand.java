
/**
 * Beschreiben Sie hier die Klasse Inhand.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Inhand
{
    Gegendstang Inhand=new Gegendstang();

    public Inhand()
    {
        
    }
    public void setInhand(Gegendstang b,Mensch pMensch){ 
        
      switch (Inhand.getName()){
        case "Schwert": Schwert.Aushandabzug(pMensch);
                      break;
        case "Schild": Inhand.Aushandabzug(pMensch);
                      break;
        case "Bogen": Inhand.Aushandabzug(pMensch);
                      break;
        
        
        
        
        
        
        }
   }

}
