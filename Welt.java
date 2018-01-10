
  public class Welt
{
    
    Gegendstang Gegendstang;
    Gegendstang[][]Welt=  new Gegendstang[61][51];
    Wand Wand=new Wand();

    
   Monster Monster=new Monster();
   Boden Boden =new Boden();
   Schwert Schwert =new Schwert();
   Goblin Goblin=new Goblin();
   Endboss Endboss=new Endboss();
   Wolf Wolf =new Wolf();
   Dämon Dämon =new Dämon();
   Bogen Bogen=new Bogen();
   Schild Schild =new Schild();
   Apfel Apfel=new Apfel();
    public Welt() 
    {
        
    }

    public void    Erstellemap()
    {
   
        
       for(int i=0;i<60;i++){
        
        
          for(int j=0;j<50;j++){
        
              Welt [i][j]=Boden;
        
        
        
        
        
        
        
        
        } 
        
        
        
        
        
        
        
        } 
        
        
        
        
        
        
        
        
        
        
        
        
        
        for(int i=0;i<60;i++){
    Welt[i][0]=Wand;
    Welt[i][1]=Wand;
    
    
    
    
    }
     for(int i=0;i<61;i++){
    Welt[i][7]=Wand;
    
    
    
    
    
    }
       for(int i=0;i<20;i++){
    Welt[i][12]=Wand;
    
    
    
    
    
    } 
     for(int i=23;i<45;i++){
    Welt[i][21]=Wand;
    
    
    
    
    
    }   
       
    for(int i=48;i<59;i++){
    Welt[i][21]=Wand;
    
    
    
    
    
    } 
    for(int i=0;i<25;i++){
    Welt[i][28]=Wand;
    
    
    
    
    
    } 
    for(int i=36;i<54;i++){
    Welt[i][28]=Wand;
    
    
    
    
    
    } 
        for(int i=56;i<60;i++){
    Welt[i][28]=Wand;
    
    
    
    
    
    } 
            for(int i=30;i<=31;i++){
    Welt[i][33]=Wand;
    
    
    
    
    
    } 
      for(int i=36;i<=59;i++){
    Welt[i][34]=Wand;
    
    
    
    
    
    } 
         for(int i=31;i<=50;i++){
    Welt[i][41]=Wand;
    
    
    
    
    
    } 
            for(int i=53;i<=59;i++){
    Welt[i][41]=Wand;
    
    
    
    
    
    } 
               for(int i=3;i<=25;i++){
    Welt[i][42]=Wand;
    
    
    
    
    
    } 
            for(int i=0;i<50;i++){
    Welt[0][i]=Wand;
    Welt[60][i]=Wand;
     Welt[1][i]=Wand;
    
    
    
    
    }
               for(int i=0;i<5;i++){
    Welt[20][i]=Wand;
  
    
    
    
    
    
    }
                   for(int i=7;i<21;i++){
    Welt[20][i]=Wand;
  
    
    
    
    
    
    }
                 for(int i=0;i<3;i++){
    Welt[35][i]=Wand;
  
    
    
    
    
    
    }
                   for(int i=5;i<21;i++){
    Welt[35][i]=Wand;
  
    
    
    
    
    
    }
                       for(int i=21;i<37;i++){
    Welt[25][i]=Wand;
  
    
    
    
    
    
    }
                        for(int i=41;i<51;i++){
    Welt[25][i]=Wand;
  
    
    
    
    
    
    }
                        for(int i=21;i<33;i++){
    Welt[30][i]=Wand;
  
    
    
    
    
    
    }
                            for(int i=21;i<28;i++){
    Welt[44][i]=Wand;
  
    
    
    
    
    
    }
                               for(int i=33;i<38;i++){
    Welt[31][i]=Wand;
  
    
    
    
    
    
    }
                               for(int i=38;i<41;i++){
    Welt[31][i]=Wand;
  
    
    
    
    
    
    }
    
     Welt[2][1]=Schwert;
     Welt[12][2]=Schwert;
     Welt[39][2]=Goblin;
     Welt[50][2]=Goblin;
     Welt[6][3]=Dämon;   
     Welt[26][3]=Bogen;   
     Welt[32][3]=Dämon;
     Welt[8][5]=Bogen;
     Welt[19][5]=Wolf;
     Welt[22][5]=Schwert;
     Welt[50][5]=Schwert;
     Welt[24][6]=Goblin;
     Welt[13][7]=Dämon;
     Welt[40][7]=Goblin;
     Welt[49][9]=Goblin;
     Welt[57][9]=Dämon;
     Welt[3][10]=Goblin;
     Welt[28][13]=Dämon;
     Welt[18][15]=Apfel;
     Welt[1][3]=Dämon;
     Welt[32][15]=Dämon;
        Welt[40][15]=Apfel;
     Welt[41][6]=Wolf;
     Welt[41][14]=Wolf;
     
        
        
        
        
        
        
        
        
        
        
        
    
      
    }
    public Gegendstang mapget(int z,int h){
    
        return Welt[z][h];
    
    }
   public String getName(int i,int x){
       return  Welt[i][x].getName();
        
       
       
    }
  public boolean aufhebbar(int i,int x){
      
      return Welt[i][x].aufhebbar();
    }
  public boolean Monster(int i,int x){
      
      return Welt[i][x].Monster();
    }
    public void set(int h,int j,Gegendstang u){
        Welt[h][j]=u;
    
    
    
    }
}

        
        
    


