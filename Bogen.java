
public class Bogen extends Gegendstang
{
    
    boolean verschlossentür;
    public Bogen()
    {
     aufhebbar=true;
     Name="Bogen";
    Monster=false;
    }
    public String gebNam(){
    return Name;
    
    }
    public void Inhandbonus(Mensch Mensch){
    
        Mensch.setKraft(100);
    
    }
      public void Aushandabzug(Mensch Mensch){
    
        Mensch.setKraft(0);
    
    }
}

