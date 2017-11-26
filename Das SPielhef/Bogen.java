
public class Bogen extends Gegendstang
{
    String Name;
    boolean verschlossentür;
    public Bogen()
    {
     aufhebbar=true;
     Name="Bogen";
   
    }
    public String gebNam(){
    return Name;
    
    }
    public void Inhandbonus(Mensch Mensch){
    
        Mensch.setKraft(10);
    
    }
      public void Aushandabzug(Mensch Mensch){
    
        Mensch.setKraft(-10);
    
    }
}

