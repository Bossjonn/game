  public class Welt
{
    
    Gegendstang Gegendstang;
    Gegendstang[][]Welt=  new Gegendstang[56][56];
    Wand Wand=new Wand();
   
    Schlüssel Schlüssel=new Schlüssel();
   Gegendstang Monster=new Monster();
   Boden Boden =new Boden();
   Schwert Schwert=new Schwert();
    public Welt() 
    {
        
    }

    public void    Erstellemap()
    {
   
        
    
        
        
        
        
        
        
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
  
     Welt[3][9]=Schlüssel;
     Welt[30][7]=Schlüssel;
     Welt[12][13]=Schlüssel;
     Welt[1][0]=Monster;
     Welt[1][1]=Schwert;
      Welt[0][0]=Monster;  
        Welt[0][1]=Schwert;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
      
    }

   public String getName(int i,int x){
       return  Welt[i][x].getName();
        
       
       
    }
  public boolean aufhebbar(int i,int x){
      
      if(  Welt[i][x].getaufhebbar()==true){
        return true;
        
        }
        else return false;
    
    }
  public boolean Monster(int i,int x){
      
      if( Welt[i][x].Monster()==true){
        return true;
        
        }
        else return false;
    }
    public Gegendstang getInhalt(int l,int k){
        
        return Welt[l][k];
        
    }
    public void set(int h,int g,Gegendstang f){
    Welt[h][g]=f;
    
    }
}

        
        


        
        
    


