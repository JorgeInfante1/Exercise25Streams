package com.exercise25streams.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
public class StreamsApp 
{
	public static void main(String[] args) 
	{
		File myFile = null;
		FileReader myReader = null;
		BufferedReader myBuffer = null;
		String line="";
		
		try {
			  myFile = new File("c:\\a\\a.txt");
			  myReader = new FileReader(myFile);
			  myBuffer = new BufferedReader(myReader);
			  
			  while((line = myBuffer.readLine())!=null)
			  {
			  //line = myBuffer.readLine();
			  System.out.println(line);
			  }
			  
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				myBuffer.close();
				myReader=null;
				myFile=null;
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}

}
