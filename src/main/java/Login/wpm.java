
package Login;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;



public class wpm {
    
    static String[] words = {"when", "there", "look", "where", "feel", "consider", "try", "action"};
    
    public static void main (String[]args) throws IOException{
        
        Random r = new Random();
    for(int i=0; i<5; i++) {
        System.out.print(words[r.nextInt(7)]+" ");
    }
	System.out.println();
        
        double start = LocalTime.now().toNanoOfDay();
        
	Scanner s = new Scanner(System.in);
	String input = s.nextLine();
		
	double end = LocalTime.now().toNanoOfDay();
        double elapsedTime = end - start;
        double seconds = elapsedTime/1000000000.0;
        int numChars = input.length();
        // (x characters / 5) / 1min = y WPM
        int wpm = (int) ((((double)numChars/5)/seconds)*60);
        
        System.out.println("Your wpm is " +wpm+"!");
        
        
        
        //Data
        
        int accuracy = 100;
        //String mistake = "consider";
        
        
        try{
            FileWriter fw = new FileWriter("chan.txt",true);
            fw.write(wpm+"\t"+accuracy+"\n");
            fw.close();
        }catch(IOException ex){}
        
        

       

        
    }
    
}
