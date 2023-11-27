class OddThread extends Thread{
	public void run(){
		for(int i=1;i<=100;i+=2){
			System.out.print(i+" ");
		}
	}
}
class EvenThread extends Thread{
	public void run(){
		for(int i=2;i<=100;i+=2){
			System.out.println(i+" ");
		}
	}
}
public class DisplayNum{
	public static void main(String[] args){
		OddThread odd=new OddThread();
		EvenThread even=new EvenThread();
		odd.start();
		even.start();		
	}
}
