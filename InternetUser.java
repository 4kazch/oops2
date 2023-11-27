import java.util.*;
public class InternetUser{
	public static int count=0;
	public static int happyCustomers;
	public static final int MAX_TIME=2;
	public static String loginname;
	public InternetUser(String loginname){
		this.loginname=loginname;
	}
	static{
		System.out.println("Lets start browsing");
		System.out.println("Maximum "+MAX_TIME+" hours allowed");
		happyCustomers=0;
	}
	public static void show(){
		System.out.println("Number of Internet Users: "+count);
		System.out.println("Number of Happy Customers: "+happyCustomers);
	}
	public static void compute(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Are you happy? (yes / no): ");
		String isHappy=sc.nextLine();
		if(isHappy.equals("yes")){
			happyCustomers++;
			System.out.println("Happy Customer: "+loginname);
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of Users: ");
		InternetUser.count=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<count;i++){
			System.out.print("Login name of user "+(i+1)+": ");
			String loginname=sc.nextLine();
			InternetUser obj=new InternetUser(loginname);
			compute();
		}
		show();
	}
}
