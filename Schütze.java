
public class Schütze extends Mensch
{
     int Kraft=25;
    int Ausdauer=30;
    int Intelligenz=90;
     Gegendstang[] Inventar=new Gegendstang[30];
     Schlüssel Schlüssel=new Schlüssel();
    public Schütze()
    { 
         
 
        Inventar[0]=new Schlüssel();
       
    }
    public Gegendstang sagItem(){
        return Inventar[0];
    
    
    }
      public void nehme(int n,Gegendstang m){
    
        Inventar[n]=m;
        System.out.println("du hast im "+n+" Slot einen "+m);
        
        
        
        
    }
    }
