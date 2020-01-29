import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileWordCount {

	public static void main(String[] args) throws IOException {
	
		//Use HashMap to store the words
		HashMap<String, Integer> map=new HashMap<String,Integer>();
		
		//	Scanner to read the txt file
		Scanner txtFile=new Scanner("//Users//bpat12//Downloads//input.txt");
		
		while(txtFile.hasNext())
		{
			String word=txtFile.next();
			if(map.containsKey(word))
			{
			//increase count by 1 if this word has already exist in map
			int count=map.get(word)+1;
			map.put(word,count);
			
			}
			else
			{
			map.put(word, 1);
			}

		}
		txtFile.close();
		
		for(Map.Entry<String,Integer> entry : map.entrySet())
		{
		System.out.println(entry);
		}
	}
}

