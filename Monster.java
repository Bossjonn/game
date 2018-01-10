

public class Monster extends Gegendstang
{

    

    public int Leben;

    public int Schaden;

   

    public Monster()

    {
      
  
        draufgehbar=true;

        Monster=true;
    }
    public String getName(){
        return Name;
    
    }
    public void setLeben(int n){
    
        Leben=n;
        
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