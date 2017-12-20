
public class Schild extends Gegendstang
{

    boolean verschlossentür;
    public Schild()
    {
     aufhebbar=true;
     Name="Schild";
    Monster=false;
    }
    public String gebNam(){
    return Name;
    
    }
    public void Inhandbonus(Mensch Mensch){
    
        Mensch.setRüstung(80);
    
    }
      public void Aushandabzug(Mensch Mensch){
    
        Mensch.setRüstung(0);
    
    }
}

