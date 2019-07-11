import java.lang.*;
import java.io.*;


/**
 * Einstellungsklasse: verwaltet theme (dark/light), Fensterbreite (x) und evtl. Sprache
 *
 * @author Simon Werner
 * @version 11.07.2019
 */
public class Settings
{
    
    private boolean theme; 
    private Language language;
    private int sidebarLength;
    
    public Settings(boolean theme, int sidebarLength)
    {
      }
    
    public Language getLanguage(){
        return language;
        //gibt aktuell benutzte Sprache heraus
    }
    
    public boolean getTheme(){
        return theme;
        //gibt aktuelles Theme heraus
    }
    
    public void setThemeLight(){
        if(getTheme() != true){
        this.theme = true;
        //ändert aktuelles theme zu light
        }else
       {
        }
    }
    
    public void setThemeDark(){
        if(getTheme() != false){
         this.theme = false;
        //ändert aktuelles theme zu dark
        }else
       {
        }
    }
    
    public int sidebarLength(){
        return sidebarLength;
        //gibt aktuelle Seitenlänge in Pixel heraus
    }
    
    
    public void loadFromConfig(){
         try{
            FileReader fr = new FileReader("config.txt");
            BufferedReader br = new BufferedReader(fr);
            
            //FileReader liest aus der Datei "config.txt", BufferedReader liest Daten des
            //FileReaders aus
            
            String line = "";
            
            while( (line = br.readLine()) != null){
                //Solange es Zeilen zum Auslesen gibt, wird weiter gelesen
              line = br.readLine();
              
              String[] parts = line.split(": ");
              String part1 = parts[0];
              String part2 = parts[1];
        
               switch(line){
                  case "theme":
                  
                  if(parts[1]=="dark"){
                      setThemeDark(); 
                      //theme auf dark setzen 
                    }
                  else{
                      setThemeLight();
                      //theme auf light setzen
                }
                break;   
         
                case "sidebarLength":
                int x = Integer.parseInt(parts[1]);
                this.sidebarLength = x;
                // Fensterbreite anpassen
                break;
         
                //case "language":
                //break;
              }
              
            }
            System.out.println("finished");
            br.close();
            
           }
        
        catch(IOException e){
            System.out.println("Datei konnte nicht ausgelesen werden."+ e.getMessage());
            //Fehlermeldung
       }
        
        
    }
    
    public void setConfig(String themetype, String sidebarLength){
   
        try{
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("config.txt")));
            
            pw.println("theme: " + themetype);
            pw.println("sidebarLength: " + sidebarLength);
            // pw.println("langauge: " );
            
            pw.close();
        }
        catch(IOException io){
            System.out.println("Datei konnte nicht bearbeitet werden" + io.getMessage());
            //Fehlermeldung
        }
        
    
    }
    
}
