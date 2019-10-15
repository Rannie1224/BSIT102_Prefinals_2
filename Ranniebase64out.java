import java.io.*;
import java.util.*;
public class Ranniebase64out {

 public static void main(String[] args)throws Exception{
 	
			Base64.Decoder decoder = Base64.getDecoder();
    	
    		//create scanner
            System.out.print("Enter the file name  : ");
            Scanner scan = new Scanner(System.in);
            
            File file = new File(scan.nextLine()+".txt"); //enter file name
            scan = new Scanner(file); 
                       
            
            String filename = scan.nextLine();
            String decodedString = new String(decoder.decode(filename)); //scan and decode
            System.out.println(decodedString); //print

            scan.close();     //close scan
 	}
 
    
    
}