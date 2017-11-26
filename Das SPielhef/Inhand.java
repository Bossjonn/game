
/**
 * Beschreiben Sie hier die Klasse Inhand.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Inhand
{
    Gegendstang Inhand=new Gegendstang();
    Schwert Schwert=new Schwert();
    Bogen Bogen=new Bogen();
    public Inhand()
    {
        
    }
    public void setInhand(Gegendstang b){   
        if(b.aufhebbar=true){
        Inhand=b;
        b.Inhandbonus();
    }}

}
