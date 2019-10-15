import java.util.*;
import java.io.*;
public class Ranniebase64in {
    
    public static void main(String[] args)throws Exception {
    	
    	Scanner scan = new Scanner(System.in);
    	ArrayList<String> words = new ArrayList<String>();
		String wor = "";
	
    	System.out.println("Array List");
    	System.out.println("Enter ':q' to stop the program");
    	while(!wor.equals(":q")){ // it will continuously loop until the user type ":q"
    	System.out.print("Enter a string to add in the array: ");
    	wor = scan.next();
    	words.add(wor); //adds to array
    	System.out.println("Array list: " + words);
    
    		}
    		//if :q is written, it will break the loop and ask if wants to be save
    	System.out.println("Program Succesfully stopped, do you want to save the file or not?");
    	System.out.println("Please type 'Yes' or 'No'");
		String saveFile = scan.next();
        String fileName;
        
        		if(saveFile.equalsIgnoreCase("yes")) //removes case sensitive if yes and save the file
			    {
				    System.out.println("Enter your file name: ");
				    fileName = scan.next();
				    Writer writer = new FileWriter(fileName +".txt");
				    
				    String[] string = GetStringArray(words); 
   					String message1 = Arrays.toString(string); //change to string
				    String base64f = Base64.getEncoder().encodeToString(message1.getBytes()); //convert to base64
				    writer.write(base64f); 
   					writer.flush();
			     }
			        else //anything else thats not "yes" will be considered no and will not save
			        	{
			        		System.out.println("Not saved!");
			        	}
    		
    }
    
	public static String[] GetStringArray(ArrayList<String> arr) 
    { 
        String str[] = new String[arr.size()]; 
        for (int j = 0; j < arr.size(); j++) { 
            str[j] = arr.get(j); 
        } 
        return str; 
    } 
}
