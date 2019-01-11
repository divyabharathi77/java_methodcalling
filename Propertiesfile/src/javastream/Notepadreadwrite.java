package javastream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Notepadreadwrite {
	public static void main(String[] args) throws IOException 
	{
		 File fl= new File("C:\\Users\\user\\Documents\\selenium\\notepad.txt");
		 fl.createNewFile();
		 FileWriter fw= new FileWriter(fl);
		 BufferedWriter bw=new BufferedWriter(fw);
		 fw.flush();
		 
		 
		
	}

}
