

import java.util.Scanner;



public class Boxen

{

    Mensch Mensch=new Mensch();

    Monster Monster=new Monster();

    private int SchadenMo;

    private int SchadenMe;

    private int LebenMo;

    private int LebenMe;
private int SchadenMe2;
    private Scanner console = new Scanner(System.in);

    private boolean nochbock;

    public Boxen()

    {

        LebenMe=Mensch.gebLeben();

        LebenMo=Monster.gebLeben();

        nochbock=true;

    }


    public void boxen(Mensch pMensch, Monster pMonster){
        Mensch Mensch=pMensch;
        Monster Monster=pMonster;
         LebenMe=Mensch.gebLeben();
         SchadenMe=Mensch.gebSchaden();
         SchadenMo=Monster.gebSchaden();
        LebenMo=Monster.gebLeben();
        String Wahl="leer";

        System.out.println("Du triffst auf ein Monster.Du hast am Anfang"+ LebenMe + "Leben,und das Monster"+LebenMo+"Leben");

        while(Monster.gebLeben()>0 && Mensch.getLeben()>0 &&nochbock==true){

            System.out.println("Was willst du machen?");

            Wahl=console.next();

   

            switch(Wahl){

               case"Angriff1":

            

            Menschangriff1();

            Monsterangriff();

            

            

            System.out.println("Du hast noch"+Mensch.getLeben()+"Leben,da das "+Monster.getName()+" dir "+SchadenMo+"hinzugefügt hat.");

            System.out.println("Und das "+Monster.getName()+""+Monster.gebLeben()+"Leben,da du ihm "+SchadenMe+"hinzugefügt hat.");

            break;

             case"Angriff2":

            

            Menschangriff2();

            Monsterangriff();

            

            

            System.out.println("Du hast noch"+Mensch.getLeben()+"Leben,da das "+Monster.getName()+" dir "+SchadenMo+"hinzugefügt hat.");

            System.out.println("Und das" +Monster.getName()+""+Monster.gebLeben()+"Leben,da du ihm "+SchadenMe2+"hinzugefügt hat.");

            break;

            

            

            

            case"Rückzug":

            System.out.println("Du bist entkommen");

            nochbock=false;

                

           break;

               

          

        };}

            

        

        

        

        

    

            switch(Wahl){

            case "Angriff1":

                if(LebenMo<0){System.out.println("DU hast gewonnen");}

                else {System.out.println("Du hast verloren");}

            break;
               case "Angriff2":

                if(LebenMo<0){System.out.println("DU hast gewonnen");}

                else {System.out.println("Du hast verloren");}

            break;
           case"Rückzug":System.out.println("Glück gehabt");

           break;

        

        

        

        

        

    

    

    

    }

}
    public void Menschangriff1(){
        
            Monster.setLeben(Monster.gebLeben()-SchadenMe);;
        
        
        
        
}

public void Menschangriff2(){
        SchadenMe2=6*SchadenMe*(int)(Math.random());
        
            Monster.setLeben(Monster.gebLeben()-SchadenMe2);
        
        
        
        
}
public void Monsterangriff(){
        
       Mensch.setLeben(Mensch.getLeben()-SchadenMo);
        
        
        
        
}

}