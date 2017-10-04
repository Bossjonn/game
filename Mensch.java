
import java.util.Scanner;

import java.util.Random;


public class Mensch

{

    

    public int Kraft;

    int Ausdauer;

    int Leben;

    int Intelligenz;

     public int Kraft2;
    
 Random randomGenerator = new Random();

    

    public Mensch(){

     Kraft=30;

   Ausdauer=10;

        Leben=100;

     Intelligenz=9;

    


    

    

    





    

    

}

public int gebLeben(){

        return Leben;

        

        

        

        

        

        

    }

      public int gebSchaden(){

        return Kraft;

        

        

        

        

        

        

    }
    public int gebSchaden2(){
        int randomInt = randomGenerator.nextInt(10);

        Kraft2=30+randomInt*(20 - 2) +2;




        return Kraft2;

        

        

        

        

        

        

    }

    public void Aua(int b){

        Leben=Leben-b;

    

    

    

    }

          
}