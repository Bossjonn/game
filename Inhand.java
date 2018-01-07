

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
        Schild Schild=new Schild();
        Apfel Apfel=new Apfel();
    public Inhand()
    {Inhand=null;
        
    }
    public Gegendstang getInhand(){
        return Inhand;
        
    }
    public void setInhand(Mensch pMensch,Gegendstang l,int Slot){
        if(Inhand!=null){
        if(Inhand==Schwert){pMensch.addiereKraft(-30);}
        else if(Inhand==Bogen){pMensch.addiereKraft(-15);}
        else if(Inhand==Schild){pMensch.addiereRüstung(-15);}
        else if(Inhand==Apfel){Inhand=null;}
    }
        Gegendstang f=new Gegendstang();
        f=pMensch.getInventar(Slot);
        pMensch.nehme(Slot,Inhand);
        Inhand=f;
        
         if(Inhand==Schwert){pMensch.addiereKraft(30);}
        else if(Inhand==Bogen){pMensch.addiereKraft(15);}
        else if(Inhand==Schild){pMensch.addiereRüstung(15);}
        else if(Inhand==Apfel){pMensch.addiereLeben(40);}
        
        
    }
   }


