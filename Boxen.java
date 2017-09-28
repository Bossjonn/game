import java.util.Scanner;

public class Boxen
{
    Mensch Mensch=new Mensch();
    Monster Monster=new Monster();
    private int SchadenMo;
    private int SchadenMe;
    private int LebenMo;
    private int LebenMe;
    private Scanner console = new Scanner(System.in);
    private boolean nochbock;
    public Boxen()
    {
        SchadenMo=Monster.gebSchaden();
        SchadenMe=Mensch.gebSchaden();
        LebenMe=Mensch.gebLeben();
        LebenMo=Monster.gebLeben();
        nochbock=true;
    }
    public void Menschangriff1(){
        Monster.Aua(SchadenMe);
        LebenMo=LebenMo-SchadenMe;
        
        
    }
     public void Monsterangriff(){
       Mensch.Aua(SchadenMo);
         LebenMe=LebenMe-SchadenMo;
        
        
    }
 public void Menschangriff2(){
        int SchadenMen=2*Mensch.gebSchaden();
        Monster.Aua(SchadenMen);
        LebenMo=LebenMo-SchadenMen;
        
        
    }
    public void boxen(){
        String Wahl="leer";
        System.out.println("Du triffst auf ein Monster.Du hast am Anfang"+ LebenMe + "Leben,und das Monster"+LebenMo+"Leben");
        while(LebenMe>0 && LebenMo>0 &&nochbock==true){
            System.out.println("Was willst du machen?");
            Wahl=console.next();
   
            switch(Wahl){
               case"Angriff1":
            
            Menschangriff1();
            Monsterangriff();
            
            
            System.out.println("Du hast noch"+LebenMe+"Leben,da das Monster dir "+SchadenMo+"hinzugefügt hat.");
            System.out.println("Und das Monster"+LebenMo+"Leben,da du ihm "+SchadenMe+"hinzugefügt hat.");
            break;
             case"Angriff2":
            
            Menschangriff2();
            Monsterangriff();
            
            
            System.out.println("Du hast noch"+LebenMe+"Leben,da das Monster dir "+SchadenMo+"hinzugefügt hat.");
            System.out.println("Und das Monster"+LebenMo+"Leben,da du ihm "+SchadenMe+"hinzugefügt hat.");
            break;
            
            
            
            case"Rückzug":
            System.out.println("Du bist entkommen");
            nochbock=false;
                
           break;
               
          
        };}
            
        
        
        
        
    
            switch(Wahl){
            case "Angriff":
                if(LebenMo<0){System.out.println("DU hast gewonnen");}
                else {System.out.println("Du hast verloren");}
            break;
           case"Rückzug":System.out.println("Glück gehabt");
           break;
        
        
        
        
        
    
    
    
    }
}
}