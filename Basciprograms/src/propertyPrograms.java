import java.io.FileInputStream ;
import java.io.IOException;
import java.util.Properties;

public class propertyPrograms {

	public static void main(String[] args) throws IOException{
		
		String filelocation ="D:\\Acceleration\\Workspace\\Basciprograms\\MyProperty\\propertyData.properties";
		FileInputStream  fir = new FileInputStream(filelocation);
		Properties prop = new Properties();
		
		prop.load(fir);
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("EmailId"));
		System.out.println(prop.getProperty("url"));

	}

}
