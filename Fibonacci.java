import java.util.*;
public class Fibonacci{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n+3;i++){
			int num=fib(i);
			if(num<=n){
				System.out.print(num+" ");
			}
		}
	}
	public static int fib(int n){
		if(n<=1){
			return n;
		}
		else{
			return fib(n-1)+fib(n-2);
		}
	}
}
