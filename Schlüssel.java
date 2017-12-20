
public class Schlüssel extends Gegendstang
{
   Gegendstang Gegendstang= new Gegendstang();
    boolean verschlossentür;
    public Schlüssel()
    {
     aufhebbar=true;
    
    verschlossentür=false;
    }
    
    public String gebName(){
    return Name;
    
    }
   public void set(){
           Gegendstang.setName("Schlüssel");
    }
}

