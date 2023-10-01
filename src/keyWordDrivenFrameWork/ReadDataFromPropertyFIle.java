package keyWordDrivenFrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFIle {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		Properties prop = new Properties();//read the data from config file
		
		prop.load(fis);//make file ready to read
		
		String propertyData = prop.getProperty("Browser");//read any value  from property
		
		System.out.println(propertyData);
	}
}