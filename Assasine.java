

   public class Assasine extends Mensch
{
      int Kraft=25;
    int Ausdauer=30;
    int Intelligenz=90;
      String[] Inventar=new String[30];
    public Assasine()
    { 
         
        Inventar[0]="Klinge";
        
       
    }
 public String sagItem(){
    
    return Inventar[0];
    
    
    }
   public void nehme(int n,String m){
    
        Inventar[n]=m;
        System.out.println("du hast im "+n+" Slot einen "+m);
        
        
        
        
    }
    }

    

