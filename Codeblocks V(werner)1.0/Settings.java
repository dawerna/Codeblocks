import java.io.FileReader;
import java.io.*;
/**
 * Write a description of class Settings here.
 *
 * @author Simon Werner
 * @version 04.07.2019
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
    
    public int sidebarLength(){
        return sidebarLength;
        //gibt aktuelle Seitenlänge in Pixel heraus
    }
    
    public void loadFromConfig(){
        try{
            FileReader fr = new FileReader("baum.txt");
            BufferedReader br = new BufferedReader(fr);
            
            //FileReader liest aus der Datei, BufferedReader liest Daten des FileReader
            //aus
            while(true){
              String zeile = br.readLine();
              System.out.println(zeile);
              //  
            }
        }
        
        catch(IOException e){
            System.out.println("Datei konnte nicht ausgelesen werden."+ e.getMessage());
            //Fehlermeldung
        }
        
        
    }
    
    public void setFromConfig(){
    
        //
    }
    
}
