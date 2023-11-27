import java.io.*;
public class FileCount{
	public static void main(String[] args){
		String input="input.txt";
		try(BufferedReader br=new BufferedReader(new FileReader(input))){
			int charcount=0;
			int linecount=0;
			int wordcount=0;
			String line;
			while((line=br.readLine())!=null){
				charcount+=line.length();
				linecount++;
				String[] words=line.split("\\s+");
				wordcount+=words.length;
			}
			System.out.println("Number of lines: "+linecount);
			System.out.println("Number of characters: "+charcount);
			System.out.println("Number of words: "+wordcount);
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}
