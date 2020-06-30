package general;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ExecuteCmdCommands {

	public static void main(String[] args) throws Exception {
		
		String cmd="adb --version";
		//String cmd="java -version";
		
		 Process p = Runtime.getRuntime().exec(cmd);
		 BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
       
		 String temp;
		while((temp=br.readLine())!= null) {
			
			System.out.println(temp);
		}
	}
}
