

   public class Assasine extends Mensch
{
      int Kraft=25;
    int Ausdauer=30;
    int Intelligenz=90;
     Gegendstang[] Inventar=new  Gegendstang[30];
     Schlüssel Sclüssel=new Schlüssel();
    public Assasine()
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

    

