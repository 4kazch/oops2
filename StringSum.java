import java.util.*;
public class StringSum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter line of integers seperated by spaces:");
		String input=sc.nextLine();
		StringTokenizer t=new StringTokenizer(input);
		int sum=0;
		while(t.hasMoreTokens()){
			String token=t.nextToken();
			int n=Integer.parseInt(token);
			System.out.println("Integer: "+n);
			sum+=n;
		}
		System.out.println("Sum: "+sum);
	}
}
