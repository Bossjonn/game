
public class Schwert extends Gegendstang
{
    
    boolean verschlossentür;
    
    public Schwert()
    {
     aufhebbar=true;
     Name="Schwert";
     Monster=false;
    }
    public String gebNam(){
    return Name;
    
    }
    public void Inhandbonus(Mensch Mensch){
    
        Mensch.setKraft(90);
    
    }
       public void Aushandabzug(Mensch Mensch){
    
        Mensch.setKraft(0);
    
    }
   
}

