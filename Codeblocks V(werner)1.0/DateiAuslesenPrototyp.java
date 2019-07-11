import java.io.*;
import java.lang.*;

public class DateiAuslesenPrototyp
{
    
    
    
    public DateiAuslesenPrototyp()
    { 
        
        
      }
      
    public String dateiLesen(){
        try{
            FileReader fr = new FileReader("config.txt");
            BufferedReader br = new BufferedReader(fr);
            //FileReader liest aus der Datei, BufferedReader liest Daten des FileReader
            //aus
            String zeile = br.readLine();
            
           // while( (zeile = br.readLine()) != null){
             // System.out.println(zeile);
             //Liest nacheinander alle Zeilen aus
           // }
            br.close();
            return zeile;
            
            //BufferedReader wird geschlossen
        }
        
        catch(IOException e){
            System.out.println("Datei konnte nicht ausgelesen werden."+ e.getMessage());
            //Fehlermeldung
        }
        return "Attempt failed";
        
    }
   
    private String readConfig(){
        try{
            FileReader fr = new FileReader("config.txt");
            BufferedReader br = new BufferedReader(fr);
            
            //FileReader liest aus der Datei, BufferedReader liest Daten des FileReader
            //aus
            
            String zeile = br.readLine();
              
            br.close();
            return zeile;
            
        }
        
        catch(IOException e){
            System.out.println("Datei konnte nicht ausgelesen werden."+ e.getMessage());
            //Fehlermeldung
        }
        return "Attempt failed";
        
    }
    
    public void adjustNewSettings(){
        //Soll die Angaben aus der txt-Dokument die config auslesen und anpassen
        String config = dateiLesen();
        
        
        String[] parts = config.split(": ");
        String part1 = parts[0];
        String part2 = parts[1];
        
        switch(config){
         case "theme":
         //falls erstes Statement theme ist: 
         //bsp.: (theme: dark)
         if(true){
             //theme auf dark setzen 
            }
         else{
             //theme auf light setzen
            }
         break;   
         
         case "width":
         int width = Integer.parseInt(parts[1]);
         // Fensterbreite anpassen
            
         break;
         
         //case "language":
         //break;
        }
        
        
    }
    
    
    public void DateiSchreiben(String sttngs){
        try{
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("baum.txt")));
            
            pw.println("theme: " );
            pw.println("width: " );
            // pw.println("langauge: " );
            
            pw.close();
        }
        catch(IOException io){
            System.out.println("Datei konnte nicht bearbeitet werden" + io.getMessage());
            //Fehlermeldung
        }
        
    }
    
    
}
