
  public class Welt
{
    
    Gegendstang Gegendstang;
    Gegendstang[][]Welt=  new Gegendstang[56][56];
    Wand Wand=new Wand();
    Tür Tür1=new Tür();
    Tür Tür2=new Tür();
    Tür Tür3=new Tür();
    Tür Tür4=new Tür();
    Tür Tür5=new Tür();
    Schlüssel Schlüssel=new Schlüssel();
   Monster Monster=new Monster();
   Boden Boden =new Boden();
   Schwert Schwert=new Schwert();
    public Welt() 
    {
        
    }

    public void    Erstellemap()
    {
   
        
       for(int i=0;i<55;i++){
        
        
          for(int j=0;j<55;j++){
        
              Welt [i][j]=Boden;
        
        
        
        
        
        
        
        
        } 
        
        
        
        
        
        
        
        } 
        
        
        
        
        
        
        
        
        
        
        
        
        
        for(int i=0;i<13;i++){
    Welt[17][i]=Wand;
    
    
    
    
    
    }
     for(int i=7;i<17;i++){
    Welt[i][7]=Wand;
    
    
    
    
    
    }
       for(int i=17;i<55;i++){
    Welt[i][13]=Wand;
    
    
    
    
    
    } 
     for(int i=13;i<23;i++){
    Welt[19][i]=Wand;
    
    
    
    
    
    }   
         for(int i=0;i<25;i++){
    Welt[i][23]=Wand;
    
    
    
    
    
    }   
        
          for(int i=23;i<37;i++){
    Welt[25][i]=Wand;
    
    
    
    
    
    }  
              for(int i=0;i<55;i++){
    Welt[i][37]=Wand;
    
    
    
    
    
    }  
     Welt[17][5]=Tür1;
     Welt[18][23]=Tür2;
     Welt[26][30]=Tür3;
     Welt[51][13]=Tür4;
     Welt[3][9]=Schlüssel;
     Welt[30][7]=Schlüssel;
     Welt[12][13]=Schlüssel;
     Welt[1][0]=Monster;
     Welt[1][1]=Schwert;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
      
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
}

        
        
    


