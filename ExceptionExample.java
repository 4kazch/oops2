import java.util.*;
public class ExceptionExample{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		try{
			int n=sc.nextInt();
			validate(n);
		}
		catch(InputMismatchException e){
			System.out.println("Input is not valid");
		}
		catch(CustomException ce){
			System.out.println("CustomException caught: "+ce.getMessage());
		}
		finally{
			System.out.println("Finally block is executed");
		}
	}
	static void validate(int n) throws CustomException{
		if(n<0){
			throw new CustomException("Non-negative number entered");
		}
		else{
			System.out.println("Valid number enetered: "+n);
		}
	}
}
class CustomException extends Exception{
		public CustomException(String message){
			super(message);
		}
	}
