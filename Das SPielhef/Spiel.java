


import java.util.Scanner;
public class Spiel
{   
    private Scanner console = new Scanner(System.in);
    private Scanner consol = new Scanner(System.in);
    private String Klasse;
    private String Input;
    private String Name;
    private Magier Magier=new Magier();
    private Schütze Schütze=new Schütze();
    private Assasine Assasine=new Assasine();
    private Kämpfer Kämpfer=new Kämpfer();
    private Welt map=new Welt();
    private Gegendstang[][] Welt=new Gegendstang[56][37];
    private Parser parser;
    int Koordia;
    int Koordib;
    int z;
    String f;
    Mensch Mensch=new Mensch();
    Boxen Kämpfen=new Boxen();
    Monster Monster=new Monster();
    Boden Boden =new Boden();
    
    public Spiel()
    {
        parser = new Parser();

        Spielen();
    }

    public void Spielen(){
        map.Erstellemap();
        Wählen();
       

        
    
    }

    public void Wählen(){
        System.out.println("Hey willkommen bei unserem AdventureGame");
        System.out.println("Welcher Klasse möchtest du beitreten?Magier,Assasine, Kämpfer oder Schütze?");
        Klasse= console.next();
            switch (Klasse){
                case"Magier":        System.out.println("Du bist ein "+Klasse+ " Los gehts!");
                System.out.println("Du Bist ein "+ Klasse); getName();break;
                       case"Schütze":        System.out.println("Du bist ein "+Klasse+ " Los gehts!");
                System.out.println("Du Bist ein "+ Klasse); getName();break;
            
                   case"Assasine":        System.out.println("Du bist ein "+Klasse+ " Los gehts!");
                System.out.println("Du Bist ein "+ Klasse); getName();break;
            
                   case"Kämpfer":        System.out.println("Du bist ein "+Klasse+ " Los gehts!");
                System.out.println("Du Bist ein "+ Klasse); getName();break;
            
            
            }
            
      
        
            
        
        
    
    }

    public void getName(){

        String Frage;
        System.out.println("Wie heißt du denn?");
        Name= console.next();
        System.out.println("Du bist also "+ Klasse +" "+ Name+" oder?");Frage= console.next();
        if(Frage.equalsIgnoreCase("Ja")){

            
            game1();

        }
        else{getName();}
    }

    public void  game1(){

        while (Koordia!=37 || Koordib!=38) {
            System.out.println("Was willst du machen?");
            Command command = parser.getCommand();
            action(command);
        }

        
        
        
        
        
        
        
        
        
    }     

    private boolean action(Command command) 
    {
        boolean wantToQuit = false;
        if(command.isUnknown()) {
            System.out.println("Bitte was?!");

        }
        
            String commandWord = command.getCommandWord();
       
        
        switch  (commandWord) {
            case "hilfe": helfe();
                          break;
             case "Rüstung": Rüstung();
                          break;
              case "Leben": Leben();
                          break;
               case "Kraft": Kraft();
                          break;            
            case "gehe":
                  String direction = command.getSecondWord();
                  if ("norden".equalsIgnoreCase(direction)) {
                      geheN(command);
                  }
                   if ("osten".equalsIgnoreCase(direction)) {
                      geheO(command);
                  }
                   if ("westen".equalsIgnoreCase(direction)) {
                      geheW(command);
                  }
                   if ("süden".equalsIgnoreCase(direction)) {
                      geheS(command);
                  }
                  break;
                   
           
            default:
                System.out.println(String.format("Unknown command {}", commandWord));
        }
        Check();
        return wantToQuit;
    }     
    private void nehme(int b,Gegendstang n){
        switch(Klasse){
        
            case "Magier":Magier.nehme(b,n);
            break;
              case "Assasine":Assasine.nehme(b,n);
            break;
               case "Kämpfer":Kämpfer.nehme(b,n);
            break;
               case "Schütze":Assasine.nehme(b,n);
            break;
    
    
    
    
    
    
    
    
    }}
    public void Leben(){
    
    System.out.println("Du hast noch "+Mensch.getLeben()+"Leben.");
    
    }
     public void Rüstung(){
    
    System.out.println("Du hast noch "+Mensch.getRüstung()+"Rüstung.");
    
    }
     public void Kraft(){
    
    System.out.println("Du hast noch "+Mensch.getKraft()+"Kraft.");
    
    }
    private void Check(){
       if(map.aufhebbar(Koordia,Koordib)==true){
        
           System.out.println("Du kannst hier was aufheben");
           System.out.println("möchtest du "+map.getName(Koordia,Koordib)+"aufheben ?");
            String Wahl=console.next();
            switch(Wahl){
                case "Ja":System.out.println("in welches Fach?"); int D=console.nextInt();           nehme(D,Welt[Koordia][Koordib]);
                Welt[Koordia][Koordib]=Boden;
                break;
                case "Nein":System.out.println("ok");
                break;
           
                
           
           
        }}
      else{System.out.println("Nix zum Aufheben ");}  
        if(map.Monster(Koordia,Koordib)==true){
       
        
        Kämpfen.boxen(Mensch,Monster);
        } 
        
        
        
        
        
        
    }
    private void helfe(){
        System.out.println("hier alle Kommandos");

    }

       private void geheN(Command command){

            Koordia=Koordia-1;
            System.out.println("Du bist bei "+Koordia+" " + Koordib);

        
        
    
            }
        
        private void geheO(Command command){

            Koordib=Koordib+1;
            System.out.println("Du bist bei "+Koordia+" " + Koordib);

        
        
    
            }  
        
            private void geheS(Command command){

            Koordia=Koordia+1;
            System.out.println("Du bist bei "+Koordia+" " + Koordib);

        
        
    
            }  
            private void geheW(Command command){

            Koordib=Koordib-1;
            System.out.println("Du bist bei "+Koordia+" " + Koordib);

        
        
    
            }  
        
        
        
        
        }
  
    

