import java.io.*;

public class DateiAuslesenPrototyp
{
    
    private DateiAuslesenPrototyp dap = new DateiauslesenPrototyp();
    
    public DateiAuslesenPrototyp()
    { 
        
        //--°
      }
      
    public void dateiLesen(){
        try{
            FileReader fr = new FileReader("baum.txt");
            BufferedReader br = new BufferedReader(fr);
            //FileReader liest aus der Datei, BufferedReader liest Daten des FileReader
            //aus
            String zeile = "";
            //Liest eine Zeile aus
            
            while( (zeile = br.readLine()) != null){
              System.out.println(zeile);
              //Vorgang wird bei vorhandenen Zeilen wiederholt
            }
            
            br.close();
            //BufferedReader wird geschlossen
        }
        
        catch(IOException e){
            System.out.println("Datei konnte nicht ausgelesen werden."+ e.getMessage());
            //Fehlermeldung
        }
        
        
    }
    
    public void readNewSettings(){
        
        dap.dateiLesen();
        
        
    }
    
    public void DateiSchreiben(String sttngs){
        try{
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("baum.txt")));
            
            pw.println(sttngs);
            
            pw.close();
        }
        catch(IOException io){
            System.out.println("Datei konnte nicht bearbeitet werden" + io.getMessage());
            //Fehlermeldung
        }
        
    }
    
}
