

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class doesFileExist {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String path = "C:\\Users\\16462\\eclipse-workspace\\pratice\\src\\pratice\\text.properties";
		Properties prop = new Properties();
		FileInputStream Fl = new FileInputStream(path);
		File F2 = new File(path);
		prop.load(Fl);
		if (F2.exists()) {
			System.out.println("File Exist");

		} else {

			System.out.println("File not Exist ");
		}
		// prop.getProperty("Friend");
		System.out.println("Friend");
		System.out.println(prop.getProperty("Friend"));
		System.out.println(prop.getProperty("friend"));

		System.out.println("-----------------");
		System.out.println("Body");
		System.out.println(prop.getProperty("Body"));
		System.out.println(prop.getProperty("body"));

	}

}
