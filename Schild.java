
public class Schild extends Gegendstang
{
    
    boolean verschlossentür;
    public Schild()
    {
     aufhebbar=true;
     Name="Schild";
    draufgehbar=true;
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

