package com.psiexams.utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingDataFromPropertyFile {
	
	public static String readingdata (String keyname) throws IOException {
		
		File f=new File("C:\\Users\\gayat\\eclipse-workspace\\psiexams\\target\\configuration.properties");
		//this can also be written with a relative path for the directory
		//File f=new File(System.getProperty("user.dir")+"\\configuration.properties");
		
		//File input data is the class used to read the streams of characers in a file
		FileInputStream fi= new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fi);
		
		return prop.getProperty(keyname);
		
	}

	/*public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\gayat\\eclipse-workspace\\psiexams\\src\\test\\java\\configuration.properties");
		//File input data is the class used to read the streams of characers in a file
		FileInputStream fi= new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fi);//file input stream method reads data from excel,
						//reader methos reads data from notepad,property file etc
		System.out.println(prop.getProperty("browsername"));// this will read and print the data from the property file
		System.out.println(prop.getProperty("appurl"));
		fi.close();*/
	}


