package general;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Cmd 
{ 
    public static void main(String[] args) 
    { 
        try
        {  
         // We are running "dir" and "ping" command on cmd 
         Process p = Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"java -version"); 
         BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
         
		 String temp;
		while((temp=br.readLine())!= null) {
			
			System.out.println(temp);
		}
        } 
        catch (Exception e) 
        { 
            System.out.println("HEY Buddy ! U r Doing Something Wrong "); 
            e.printStackTrace(); 
        } 
    } 
}
