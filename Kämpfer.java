
public class Kämpfer extends Mensch
{
       int Kraft=25;
    int Ausdauer=30;
    int Intelligenz=90;
      Gegendstang[] Inventar=new Gegendstang[30];
      Schlüssel Schlüssel=new Schlüssel();
    public Kämpfer()
    { 
     Inventar[0]=Schlüssel;
        
       
    }
    public Gegendstang sagItem(){
        return Inventar[0];
        
        
    }
      public void nehme(int n,Gegendstang m){
    
        Inventar[n]=m;
        System.out.println("du hast im "+n+" Slot einen "+m);
        
        
        
        
    }
    }
