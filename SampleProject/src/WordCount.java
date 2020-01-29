import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class WordCount {

	static void countEachWords(String fileName, Map<String,Integer> words) throws FileNotFoundException {
		
		Scanner file= new Scanner(new File(fileName));
		while(file.hasNext()) {
			
			String word=file.next();
			Integer count=words.get(word);
			if(count!=null)
				count++;
			else
				count=1;
			words.put(word,count);
		}
		file.close();
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		
		System.out.println("Please enter file path: ");
		Scanner scanner = new Scanner(System.in);
		String fileName = scanner.nextLine();
		
		Map<String,Integer> words = new HashMap<String,Integer>();
		countEachWords(fileName,words);
		
		System.out.println("\nWord counts: ");
		
		for (Entry<String, Integer> entry : words.entrySet())  
            System.out.println(entry.getKey() + " , " + entry.getValue());
		
		System.out.println();
		
		countEachWordsTests();
		
	}
	
	public static void countEachWordsTests() throws FileNotFoundException {
		
		System.out.println("Unit Test for WordCount");
		
		Map<String,Integer> words = new HashMap<String,Integer>();
		
		countEachWords("//Users//bpat12//Downloads//input.txt",words);
		
		System.out.println("Size of map should be 10");
		System.out.println(words.size() == 10);
		System.out.println("Count of coding word should be 1 : ");
		System.out.println(words.get("coding") == 1);
		System.out.println("Count of Test word should be 1 : ");
		System.out.println(words.get("Test") == 2);
	}

}



