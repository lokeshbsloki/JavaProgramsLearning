package general;

import java.io.IOException;

public class CmdJavaIntegration {

	public static void main(String[] args) {

		excCommand("");
	}
	
	public static void excCommand(String new_dir){
	    Runtime rt = Runtime.getRuntime();
	    try {
	        rt.exec(new String[]{"cmd.exe","/c","start && java -version"});

	       
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

}
