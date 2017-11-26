
public class Schild extends Gegendstang
{
    String Name;
    boolean verschlossentür;
    public Schild()
    {
     aufhebbar=true;
     Name="Schild";
   
    }
    public String gebNam(){
    return Name;
    
    }
    public void Inhandbonus(Mensch Mensch){
    
        Mensch.setRüstung(10);
    
    }
      public void Aushandabzug(Mensch Mensch){
    
        Mensch.setRüstung(-10);
    
    }
}

