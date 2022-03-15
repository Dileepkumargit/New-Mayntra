package Utiltis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propetyfile {
	
	public  Properties obj; 
	 propetyfile() throws IOException {
		
		 obj = new Properties();
		 FileInputStream fis = new FileInputStream("C:\\Users\\abc\\eclipse-workspace\\Myntra\\element.properties");
		 obj.load(fis);
		 System.out.println(obj.getProperty("MoveToProfile"));
	}
	
//	public void config() throws IOException {
//		readconfig();
//		System.out.println(obj.getProperty("MoveToProfile"));
//	}

}
