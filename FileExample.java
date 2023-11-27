import java.io.*;
import java.util.*;
public class FileExample{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String inputfile="input.txt";
		System.out.print("Enter no. of lines: ");
		int n=sc.nextInt();
		sc.nextLine();
		try(FileWriter fw=new FileWriter(inputfile);
			BufferedWriter bw=new BufferedWriter(fw)){
			for(int i=0;i<n;i++){
				String l=sc.nextLine();
				bw.write(l);
				bw.newLine();
			}
			System.out.println("Content written to "+inputfile);
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		try(FileReader fr=new FileReader(inputfile);
			BufferedReader br=new BufferedReader(fr)){
			System.out.println("Content of "+inputfile+" :");
			String line;
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}
