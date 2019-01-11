package javastream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readingfiles {
	public static void main(String[] args) throws IOException {
		
	//stream connectivity
	File fl= new File("C:\\fileactions\\filewrite.txt");
	FileReader fr=new FileReader(fl);
	BufferedReader reader=new BufferedReader(fr);
	// reading file
	String num= null;
	while((num= reader.readLine())!=null)
	{
		System.out.println(num);
	}
		
	//reader.readLine();
	//System.out.println(reader.readLine());
	reader.close();
	System.out.println("file is being read");
	
	
	}
}
