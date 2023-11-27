import java.io.*;
import java.util.*;
public class FileLines{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String inputfile="input.txt";
		try(FileReader fr=new FileReader(inputfile);
			BufferedReader br=new BufferedReader(fr)){
			System.out.println("Content of "+inputfile+" :");
			String line;
			int i=1;
			while((line=br.readLine())!=null){
				System.out.println("Line "+i+": "+line);
				i++;
			}
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}
