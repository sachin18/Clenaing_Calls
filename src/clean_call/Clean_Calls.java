package clean_call;
import java.io.*;
import java.io.File;    
import java.io.FileWriter;    
import java.io.BufferedWriter;    
import java.io.IOException; 
import java.util.Scanner;
public class Clean_Calls {

       public static void main(String[] args) throws IOException {
             // TODO Auto-generated method stub
             int n=0;
             int lb=0,rb=0,line=0;
           
             File file=new File(System.getProperty("user.dir")+"/action.txt");
             File file2=new File(System.getProperty("user.dir")+"/GTC__P&R_Script.txt");
    
             Scanner scan=new Scanner(file).useDelimiter(";");
           
             
             while(scan.hasNext())
             {
                    n++;
                    String s=scan.next();
                    if(!(s.contains(".css")||s.contains("image/x-icon")||s.contains("image/gif")||s.contains("image/png")||s.contains("en.properties")||s.contains(".google")||s.contains("empty.htm")||s.contains("DataLoader_")||s.contains(".gif")||s.contains(".png"))||s.contains(".jsp")||s.contains("ajaxRequest"))
                    {
                           
                           FileWriter fileWritter = new FileWriter(file2,true);        
                         BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
                         bufferWritter.write(s);
                         if(scan.hasNext())
                         bufferWritter.write(";");
                         bufferWritter.close();
                         fileWritter.close();
                    }
             
                    
             }
             System.out.print("The Sript is ready at location"+System.getProperty("user.dir"));
             System.out.print("\\GTC__P&R_Script.txt");
             
             }
             
}
