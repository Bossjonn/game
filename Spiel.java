
import java.util.Scanner;
public class Spiel
{   
    private Scanner console = new Scanner(System.in);
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
    public Spiel()
    {
        parser = new Parser();

        Spielen();
    }

    public void Spielen(){
        map.Erstellemap();
        Wählen();
        getName();

        
    
    }

    public void Wählen(){
        System.out.println("Hey willkommen bei unserem AdventureGame");
        System.out.println("Welcher Klasse möchtest du beitreten?Magier,Assasine, Kämpfer oder Schütze?");
        Klasse= console.next();
        System.out.println("Du bist ein "+Klasse+ " Los gehts!");
        switch(Klasse){
        case"Magier":  
            String Ü=Magier.sagItem();
            System.out.println("Am Anfang hast du ein "+ Ü);
            break;
        case"Kämpfer":  
        String Q=Kämpfer.sagItem();
        System.out.println("Am Anfang hast du ein "+ Q);    
         break;
          case"Assasine": String L=Kämpfer.sagItem();
        System.out.println("Am Anfang hast du ein "+ L);
          break; 
            case"Schütze": String B=Schütze.sagItem();
        System.out.println("Am Anfang hast du ein "+ B);
          break;  
            
            
            
            
            
        }

        
        
    
    }

    public void getName(){

        String Frage;
        System.out.println("Wie heißt du denn?");
        Name= console.next();
        System.out.println("Du bist also "+ Klasse +" "+ Name);Frage= console.next();
        if(Frage.equalsIgnoreCase("Ja")){

            
            game1();

        }

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
        System.out.println(Welt[Koordia][Koordib]);
        
        switch  (commandWord) {
            case "hilfe": helfe();
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
                   
            case "nimm":nehme(z,f);      
                  break;
            default:
                System.out.println(String.format("Unknown command {}", commandWord));
        }
        
        return wantToQuit;
    }     
    private void nehme(int b,String n){
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
  
    

