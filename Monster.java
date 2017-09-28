

public class Monster extends Gegendstang
{
    
    public int Leben;
    public int Schaden;
   
    public Monster()
    {
       Leben=200;
       Schaden=10;
    }

    public int gebLeben(){
        return Leben;
        
        
        
        
        
        
    }
      public int gebSchaden(){
        return Schaden;
        
        
        
        
        
        
    }
    public void Aua(int b){
        Leben=Leben-b;
    
    
    
    }
}
