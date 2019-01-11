package javastream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writingfiles {

	public static void main(String[] args) throws IOException {
		// stream connectivity
		 File fn=new File("C:\\fileactions\\filewrite.html");//if it is html then it shoukd be .html,.svs
         FileWriter writer=new FileWriter(fn,true);
         BufferedWriter fwriter= new BufferedWriter(writer);
         // writing text
         
         /*for (int i=0;i<10;i++){
        	 
        	 for(int j=0;j<10;j++){
        		 
        		 int num=(int)(Math.random()*100);
        		 fwriter.write(num+"\t");
        	 }
        	 fwriter.newLine();
         }*/
         fwriter.write("<html><body><title>Testing is fun</title></body></html>");
         /*String name= "divya";
         String para=" Life is all about challenges";
         fwriter.write(para);
         fwriter.newLine();
         fwriter.write(name);*/
         //closing stream
         fwriter.close();
         System.out.println("file is created");
         
	}

}
