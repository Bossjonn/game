
public class Schwert extends Gegendstang
{
    String Name;
    boolean verschlossentür;
    public Schwert()
    {
     aufhebbar=true;
     Name="Schwert";
   
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

