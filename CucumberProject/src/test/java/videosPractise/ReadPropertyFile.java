package videosPractise;

import java.io.*;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {

		//FileReader fr=new FileReader("C:\\Users\\manisha.kamble\\git\\NewRepo\\CucumberProject\\src\\test\\java\\videosPractise\\practice.properties");
		
		//FileReader fr=new FileReader(System.getProperty("user.dir")+ "\\src\\test\\java\\videosPractise\\practice.properties");
		
		FileInputStream fr= new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\videosPractise\\practice.properties");
		Properties pr=new Properties();
		pr.load(fr);
		
		System.out.println(pr.getProperty("name"));
		System.out.println(pr.getProperty("url"));
		System.out.println(System.getProperty("user.dir"));

	}

}
