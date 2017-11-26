import java.util.Scanner;

import java.util.Random;


public class Mensch

{

    

    public int Kraft;

    int Ausdauer;

    int Leben;

    int Intelligenz;

     public int Kraft2;
    Gegendstang[] Inventar=new Gegendstang[10];
 Random randomGenerator = new Random();

    Gegendstang Gegendstand=new Gegendstang();
int Rüstung;
    public Mensch(){
       int Rüstung=0;
     Kraft=30;

   Ausdauer=10;

        Leben=100;
        
     Intelligenz=9;

    


    

    

    





    

    

}
public void nehme(int l,Gegendstang b){
    Inventar[l]=b;
}
public int gebLeben(){

        return Leben;   

    }
public void setRüstung(int l)
{   


    Rüstung=+l;}
    public void setLeben(int l)
{   


    Leben=+l;}
    public void setKraft(int l)
{   


    Kraft=+l;}
    public int getRüstung()
{   


    return Rüstung;}
    public int getLeben()
{   


    return Leben;}
    public int getKraft()
{   


    return Kraft;}
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