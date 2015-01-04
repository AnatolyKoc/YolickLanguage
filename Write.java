package yolickide;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Write {

	String write(String a,String b)
	{
		try {
			 
			String content = a;
 
			File file = new File(b);
 
		
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
		
 
		} catch (IOException e) {
			e.printStackTrace();
		}
		return a;
	}
     
}
