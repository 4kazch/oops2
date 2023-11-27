import java.util.*;
import java.io.*;
public class FileStream{
	public static void main(String[] args) throws IOException{
		FileOutputStream f1=new FileOutputStream("input2.txt");
		FileInputStream f2=new FileInputStream("input.txt");
		try{
			int c;
			do{
				c=f2.read();
				if(c!=-1){
					f1.write((char)c);
					System.out.print((char)c);
				}
			}while(c!=-1);
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}
