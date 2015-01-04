package yolickide;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Read {
	YL translate = new YL();
	String line="";
	String all="";
	String read(String a)
	{
		BufferedReader br = null;
		 
		try {
 
	
                        all="";
			br = new BufferedReader(new FileReader(a));
                            
			while ((line=br.readLine()) != null) {
			all=all+translate.write(line)+"\n";
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return all;
	}

}
